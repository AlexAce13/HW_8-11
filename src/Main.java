import org.avivicourses.lesson8.association.Student;
import org.avivicourses.lesson8.association.Teacher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        students();
    }

    private static void students() {

        Student alex = new Student("Alex");
        Student denis = new Student("Denis");
        Teacher teacher = new Teacher();
        teacher.setSubject("English");
        teacher.setStudents(Arrays.asList(alex, denis));
        System.out.println("Teacher of " + teacher.getSubject());
        for (Student student : teacher.getStudents()){
            System.out.println(student.getName());
        }

    }
}