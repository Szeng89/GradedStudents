package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreTest() {
        Double[] s1Scores = { 100.0, 150.0};
        Double[] s2Scores = { 225.0, 25.0};

        Student s1 = new Student("Student", "1", s1Scores);
        Student s2 = new Student("Student", "2", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        //When
        double actual = classroom.getAverageExamScore();
        double expected = 125.0;

        Assert.assertEquals(expected, actual, 0.001);
    }

}
