package com.accp.com.accp.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

public class User {
    private int error;
    private String message;
    @JSONField(format = "yyyy-MM-dd")
    private Date birthDate;
    private List<Student> students;
    private Student student;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage()    {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
