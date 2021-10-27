package be;

public class GradeInfo {

    private String subject;
    private int grade;

    public GradeInfo(String subject, int grade)
    {
        this.subject = subject;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "GradeInfo{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
