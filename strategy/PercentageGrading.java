package strategy;

import java.util.Map;

public class PercentageGrading implements GradingStrategy {
    @Override
    public String calculateGrade(Map<String, Integer> marks) {
        double total = 0;
        for (int m : marks.values()) total += m;
        double percent = total / marks.size();
        return String.format("%.2f",percent);
    }
}