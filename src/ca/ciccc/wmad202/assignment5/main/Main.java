package ca.ciccc.wmad202.assignment5.main;

import ca.ciccc.wmad202.assignment5.problem1.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] gradesList = {80, 78, 65, 34};
        int[] gradesList2 = {};
        Student student = new Student(77889911, gradesList, "Dave");
        Student student2 = new Student(66553322, gradesList2,"James");

        student2.addGrade(87);
        student2.addGrade(63);
        student2.addGrade(45);
        student2.addGrade(91);
        System.out.println(student.studentID);
        System.out.println(student.studentName);
        ArrayList<Integer> grades = null;
        for(int i = 0; i < gradesList.length; i++){
                    grades = student.addGrade(gradesList[i]);
                }
        System.out.println(Arrays.toString(grades.toArray()));

        System.out.println(student2.gradesList.toString());
        int gpaStudent1 = student.calcGPA();
        int gpaStudent2 = student2.calcGPA();

        System.out.println("The GPA of Dave: " + gpaStudent1);
        System.out.println("The GPA of James: " + gpaStudent2);
        student.studentInfo();
        student2.studentInfo();

        int compareGPAToStudent1 = student.compareGPA(71);
        int compareGPAToStudent2 = student2.compareGPA(64);
        System.out.print("Comparing james and a student with a GPA of 71, Dave ");
        if (compareGPAToStudent1 == 1){
            System.out.println("higher");
        } else if(compareGPAToStudent1 == -1){
            System.out.println("lower");
        } else if(compareGPAToStudent1 == 0){
            System.out.println("is even");
        }

        System.out.print("Comparing james and a student with a GPA of 64, James ");
        if (compareGPAToStudent2 == 1){
            System.out.println("is higher");
        } else if(compareGPAToStudent2 == -1){
            System.out.println("is lower");
        } else if(compareGPAToStudent2 == 0){
            System.out.println("is even");
        }
    }
}
