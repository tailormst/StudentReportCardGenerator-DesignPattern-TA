package strategy;

import java.util.Map;

public class RelativeGrading implements GradingStrategy {
    @Override
    public String calculateGrade(Map<String, Integer> marks) {
        double total = 0;
        for (int m : marks.values()) total += m;
        double avg = total / marks.size();

        if (avg > 85) return "Top Performer";
        else if (avg > 70) return "Above Average";
        else if (avg > 50) return "Average";
        else return "Needs Improvement";
    }
}