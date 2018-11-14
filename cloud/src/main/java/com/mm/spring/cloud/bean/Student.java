package com.mm.spring.cloud.bean;

public class Student {
    private Long id;

    private String name;

    private Byte age;

    public Student(String name, Byte age) {
        this.name = name;
        this.age = age;
    }

    public Student(Long id, String name, Byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}