package be;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<GradeInfo> gradeReport;
    private String education;

    public Student(int id, String name, String email, String education) {
        super(id, email, name);
        this.education = education;
        gradeReport = new ArrayList<>();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    /**
     * Gets the grade for a specific subject.
     * @param subject The subject to find the grade for.
     * @return The grade if the subject is found, otherwise -1.
     */
    public int getGrade(String subject) {
        int grade = -1;
        for (GradeInfo info : gradeReport) {
            if (info.getSubject().equals(subject)) {
                grade = info.getGrade();
                break;
            }
        }
        return grade;
    }

    public double getAverageGrade()
    {
        double averageGrade = 0.0;
        for(GradeInfo info : gradeReport)
        {
            averageGrade += info.getGrade();
        }
        return averageGrade/gradeReport.size();
    }

    public void addGrade(GradeInfo gradeInfo)
    {
        gradeReport.add(gradeInfo);
    }


    @Override
    public void doSomething() {
        System.out.println("Study");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20s %-20s", education, getAverageGrade());
    }
}
