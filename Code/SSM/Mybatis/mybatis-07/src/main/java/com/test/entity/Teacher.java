package com.test.entity;

import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Student> students;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + students +
                '}';
    }

    public Teacher(int id, String name, List<Student> student) {
        this.id = id;
        this.name = name;
        this.students = student;
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
