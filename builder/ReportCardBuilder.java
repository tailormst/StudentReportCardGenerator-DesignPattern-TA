package builder;

import java.util.HashMap;
import java.util.Map;

public class ReportCardBuilder {
    private String studentName;
    private Map<String, Integer> subjectMarks = new HashMap<>();
    private String grade;
    private String remarks;

    public ReportCardBuilder setStudentName(String name) {
        this.studentName = name;
        return this;
    }

    public ReportCardBuilder addSubjectMark(String subject, int mark) {
        this.subjectMarks.put(subject, mark);
        return this;
    }

    public ReportCardBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public ReportCardBuilder setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public ReportCard build() {
        return new ReportCard(studentName, subjectMarks, grade, remarks);
    }
}