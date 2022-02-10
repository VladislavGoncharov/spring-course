package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student student1 = new Student("Vladislav Goncharov", 4,4.6);
        Student student2 = new Student("Piter Parker", 3,4.8);
        Student student3 = new Student("Melik Igor", 1,3.9);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(int course){
        System.out.println("Get Students from University:");
        System.out.println(students);
        return students;
    }
}
