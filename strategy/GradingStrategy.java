package strategy;

import java.util.Map;

public interface GradingStrategy {
    String calculateGrade(Map<String, Integer> marks);
}