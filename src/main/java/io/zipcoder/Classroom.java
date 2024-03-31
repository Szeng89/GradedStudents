package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private ArrayList<Student> students;

    public Classroom(int maxNumberOfStudents) {
        this.students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(Student[] studentsArray) {
        this.students = new ArrayList<>(Arrays.asList(studentsArray));
    }

    public Classroom() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(this.students);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }


    public double getAverageExamScore() {
        double averageScoreOfStudents = 0;
        int numberOfStudents = 0;

        for (Student student : this.students) {
            if (student != null) {
                averageScoreOfStudents += student.getAverageExamScore();
                numberOfStudents++;
            }
        }
        if (numberOfStudents == 0) {
            return 0.0;
        }
        return averageScoreOfStudents / numberOfStudents;
    }
}
