import facade.ReportCardFacade;
import builder.ReportCard;
import strategy.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Report Card Generator ===");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Map<String, Integer> marks = new HashMap<>();
        System.out.println("Enter marks for 3 subjects:");
        System.out.print("Math: "); marks.put("Math", sc.nextInt());
        System.out.print("Science: "); marks.put("Science", sc.nextInt());
        System.out.print("English: "); marks.put("English", sc.nextInt());

        System.out.println("\nSelect Grading Strategy:");
        System.out.println("1. Percentage\n2. GPA\n3. Relative");
        int choice = sc.nextInt();

        GradingStrategy strategy = switch (choice) {
            case 2 -> new GPAGrading();
            case 3 -> new RelativeGrading();
            default -> new PercentageGrading();
        };

        ReportCardFacade facade = new ReportCardFacade(strategy);
        ReportCard report = facade.generateReport(name, marks);
        report.displayReport();
    }
}