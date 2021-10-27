import be.GradeInfo;
import be.Person;
import be.Student;
import be.Teacher;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Person ib = new Student(5, "Ib", "MMD");
        Student studentIb = (Student) ib;

        studentIb.setEducation("DMU");

        ArrayList<Person> persons = new ArrayList<>();


        Teacher jeppe = new Teacher(4, "Jeppe", "JML");
        jeppe.addSubject("SCO");
        persons.add(jeppe);

        Student ibBo = new Student(6, "Ib-Bo", "DMU");
        ibBo.addGrade(new GradeInfo("SCO", -3));
        ibBo.addGrade(new GradeInfo("SDE", 12));
        ibBo.addGrade(new GradeInfo("ITO", 4));

        persons.add(ibBo);

        String header = String.format("%-5s %-20s %-20s", "ID", "NAME", "EMAIL");
        System.out.println(header);
        for (Person p : persons) {
            System.out.println(p);
            p.doSomething();
        }

    }

}
