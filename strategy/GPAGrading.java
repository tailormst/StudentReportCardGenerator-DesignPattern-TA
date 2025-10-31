package strategy;

import java.util.Map;

public class GPAGrading implements GradingStrategy {
    @Override
    public String calculateGrade(Map<String, Integer> marks) {
        double total = 0;
        for (int m : marks.values()) total += m;
        double avg = total / marks.size();
        double gpa = (avg / 100) * 10;

        return String.format("%.2f GPA", gpa);
    }
}