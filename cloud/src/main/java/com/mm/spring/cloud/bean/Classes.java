package com.mm.spring.cloud.bean;

import javax.persistence.*;

public class Classes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String classes;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return classes
     */
    public String getClasses() {
        return classes;
    }

    /**
     * @param classes
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }
}