package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Eric S", 3, 4.5);
        Student st2 = new Student("Viktor D", 2, 2.5);
        Student st3 = new Student("Elena V", 1, 3.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start of work getStudents()");
//        System.out.println(students.get(3));
        System.out.println("Information from getStudents():");
        System.out.println(students);
        return students;
    }
}
