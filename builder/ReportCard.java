package builder;

import java.util.Map;

public class ReportCard {
    private String studentName;
    private Map<String, Integer> subjectMarks;
    private String grade;
    private String remarks;

    public ReportCard(String studentName, Map<String, Integer> subjectMarks, String grade, String remarks) {
        this.studentName = studentName;
        this.subjectMarks = subjectMarks;
        this.grade = grade;
        this.remarks = remarks;
    }

    public void displayReport() {
        System.out.println("\n----- Student Report Card -----");
        System.out.println("Name: " + studentName);
        System.out.println("Marks:");
        subjectMarks.forEach((subject, mark) -> System.out.println(" - " + subject + ": " + mark));
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}