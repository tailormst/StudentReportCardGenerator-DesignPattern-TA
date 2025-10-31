package facade;

import builder.ReportCard;
import builder.ReportCardBuilder;
import strategy.GradingStrategy;

import java.util.Map;

public class ReportCardFacade {
    private GradingStrategy gradingStrategy;

    public ReportCardFacade(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }

    public ReportCard generateReport(String name, Map<String, Integer> marks) {
        String grade = gradingStrategy.calculateGrade(marks);
        String remarks = switch (grade) {
            case "A+", "A" -> "Excellent performance!";
            case "B" -> "Good work!";
            case "C" -> "Needs improvement!";
            default -> "Work harder next time.";
        };

        return new ReportCardBuilder()
                .setStudentName(name)
                .setGrade(grade)
                .setRemarks(remarks)
                .build();
    }
}