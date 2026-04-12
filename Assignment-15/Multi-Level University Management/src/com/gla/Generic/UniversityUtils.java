package com.gla.Generic;

import java.util.List;

public class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getDetails());
        }
    }
}
