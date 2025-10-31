package strategy;

import java.util.Map;

public class PercentageGrading implements GradingStrategy {
    @Override
    public String calculateGrade(Map<String, Integer> marks) {
        double total = 0;
        for (int m : marks.values()) total += m;
        double percent = total / marks.size();

        if (percent >= 90) return "A+";
        else if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else return "D";
    }
}