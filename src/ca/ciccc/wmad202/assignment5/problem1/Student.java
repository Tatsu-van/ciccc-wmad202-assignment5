package ca.ciccc.wmad202.assignment5.problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    // Initialize values
    public int studentID;
    public ArrayList<Integer> gradesList;
    public int[] listOfGrades;
    public String studentName;
    public int lengthOfList;

    // Instance
    public Student(int id, int[] list, String name){
        this(id,name);
        this.listOfGrades = list;
        this.lengthOfList = list.length;
    }

    // Instance
    public Student(int id, String name){
        this.studentID = id;
        this.studentName = name;
        this.gradesList = new ArrayList<Integer>();
    }

    // Instance Method
     public ArrayList<Integer> addGrade (int grade) {
        this.gradesList.add(grade);
        return gradesList;
    }

    // Instance Method
    public int calcGPA(){
        int gpa;
        int total = 0;
        // When student has already given an array of grades
        if(this.gradesList.size() != 0){
            int classes = this.gradesList.size();
            for(int i =0; i < this.gradesList.size(); i++){
                total += this.gradesList.get(i);
            }
            gpa = total / classes;
        }
        // Otherwise when a student hasn't given an array and want to add value into an arraylist
        else {
            int classes = this.listOfGrades.length;
            for (int i = 0; i < classes; i++){
                total += this.listOfGrades[i];
            }
            gpa = total / classes;
        }
        return gpa;
    }

    // Instance Method
    public void studentInfo(){
        System.out.println("The student ID: " + this.studentID);
        System.out.println("The name of student: " + this.studentName);
        System.out.println("The all grades: " + Arrays.toString(this.listOfGrades));
        System.out.println("The GPA: " + calcGPA());
    }

    // Instance Method
    public int compareGPA(int otherStudent){
        if (calcGPA() > otherStudent){
            return 1;
        }
        else if (calcGPA() < otherStudent){
            return -1;
        }
        else {
            return 0;
        }
    }
}
