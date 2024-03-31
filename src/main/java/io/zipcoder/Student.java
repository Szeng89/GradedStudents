package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public int getExamsTaken() {
        return examScores.size();
    }


    public String getExamScores() {
        StringBuilder sb = new StringBuilder("Exam Scores:\n");
        int examNumber = 1;
        for (Double score : examScores) {
            sb.append(String.format("\tExam %d -> %.2f\n", examNumber++, score));


        }
        return sb.toString();
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
//        examScores.set(examNumber, newScore); doesnt work because the array starts at 0 where as exams start at 1
        int i = examNumber - 1;
        if ( i >= 0 && i < examScores.size()) {
            examScores.set(i, newScore);
        }
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Double score :examScores) {
            sum += score;
        }
        return sum / examScores.size();

    }

    @Override
    public String toString() {
        String result = "Student Name: " + firstName + " " + lastName + "\n";

        result += "Average Score: " + String.format("%.1f", getAverageExamScore()) + "\n";

        result += "Exam Scores:\n" + getExamScores().replace("\t", "   ").trim();

        return result;
    }


}
