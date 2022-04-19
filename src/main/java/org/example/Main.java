



package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StudentCourse studentCourse = new StudentCourse(1, new int[]{11, 22, 33});
         StudentCourse[] allCoursesForStud = new StudentCourse[6];
        StudentCourseGrade s1_11 = new StudentCourseGrade(1,11,100);
        StudentCourseGrade s2_11 = new StudentCourseGrade(2,11,90);
        StudentCourseGrade s1_22 = new StudentCourseGrade(1,22,100);
        StudentCourseGrade s1_33 = new StudentCourseGrade(1,33,100);
        StudentCourseGrade[ ] student = new StudentCourseGrade[3];

        AvgGradeForCourse avgCourse = new AvgGradeForCourse();

        for (int i=0;i<allCoursesForStud.length;i++){

        }



    }
}