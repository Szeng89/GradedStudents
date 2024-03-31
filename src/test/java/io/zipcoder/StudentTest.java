package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void getExamScoreTest() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.getExamScores();

        // Then
        String expected = "Exam Scores:\n\tExam 1 -> 100.0\n\tExam 2 ->95.0\n\tExam 3 -> 123.0\n\tExam 4 -> 96.0";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addExamScoreTest() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100);
        String actual = student.getExamScores();

        // Then
        String expected = "Exam Scores:\n\tExam 1 -> 100";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setExamScoreTest() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1,150.0);

        // Then
        String expected = "Exam Scores:\n\tExam 1 -> 150.00\n";
        String actual = student.getExamScores();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAverageExamScore() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double actual = student.getAverageExamScore();

        // Then
        Double expected = 125.0;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void toStringTest() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.toString();

        // Then
        String expected =
                "Student Name: Leon Hunter\n" +
                        "Average Score : 125.0\n" +
                        "Exam Scores:\n" +
                        "   Exam 1 -> 100.0\n" +
                        "   Exam 2 -> 150.0\n" +
                        "   Exam 3 -> 250.0\n" +
                        "   Exam 4 -> 0.0\n";



        Assert.assertEquals(actual, expected);

    }

}