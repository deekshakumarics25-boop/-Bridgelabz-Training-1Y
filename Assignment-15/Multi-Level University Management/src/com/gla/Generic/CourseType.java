package com.gla.Generic;

public abstract class CourseType {
    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getDetails() {
        return courseName;
    }
}
