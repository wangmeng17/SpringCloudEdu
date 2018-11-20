package com.mm.spring.cloud.bean;

import javax.persistence.*;

@Table(name = "`classes`")
public class Classes {
    @Column(name = "`id`")
    private Long id;

    @Column(name = "`classes`")
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