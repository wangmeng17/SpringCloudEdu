package com.mm.spring.cloud.bean;

public class Classes {
    private Long id;

    private String classes;

    public Classes(Long id, String classes) {
        this.id = id;
        this.classes = classes;
    }

    public Classes() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }
}