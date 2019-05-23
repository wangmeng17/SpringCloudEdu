package com.mm.spring.cloud.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel
@Table(name = "`student`")
public class Student {
    @ApiModelProperty(hidden = true)
    @Column(name = "`id`")
    private Long id;

    @ApiModelProperty(value = "用户名", example = "mm", required = true)
    @Column(name = "`name`")
    private String name;

    @ApiModelProperty(value = "年龄", example = "125", dataType = "byte", required = true)
    @Column(name = "`age`")
    private Byte age;

    public Student() {
    }

    public Student(String name, Byte age) {
        this.name = name;
        this.age = age;
    }

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Byte getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Byte age) {
        this.age = age;
    }
}