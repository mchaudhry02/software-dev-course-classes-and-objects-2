package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        students.add(new Student(name, grade));
    }

    public void removeStudent(String name) {
        students.removeIf(s -> s.name.equals(name));
    }

    public String getStudentList() {
        // This method should return a string with each student's name and grade
        // separated by a space, with each student separated by a newline character ('\n')
        // E.g.
        // John 90.9
        // Jane 88.3
        //
        // You will need to use a String or StringBuilder to build the result by
        // looping through the list of students
        //
        // Replace the following line with your implementation
        StringBuilder result = new StringBuilder();
        for (Student s : students) {
            result.append(s.name).append(" ").append(s.grade).append("\n");
        }
        return result.toString();
    }
}
