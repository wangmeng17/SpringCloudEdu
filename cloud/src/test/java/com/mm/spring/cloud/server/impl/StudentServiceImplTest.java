package com.mm.spring.cloud.server.impl;

import com.mm.spring.cloud.bean.DataBase;
import com.mm.spring.cloud.bean.Student;
import com.mm.spring.cloud.server.IStudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  16:03
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    private IStudentService studentService;

    @Test
    public void addStudent() {
        Student student = new Student("mm", (byte) 18);
        DataBase dataBase = studentService.addStudent(student);
        Assert.assertEquals(1, dataBase.getData());
    }

    @Test
    public void deleteStudentByName() {
        studentService.deleteAll();
        Student student = new Student("mm", (byte) 18);
        studentService.addStudent(student);
        DataBase dataBase = studentService.deleteStudentByName("mm");
        Assert.assertEquals(1, dataBase.getData());
    }

    @Test
    public void deleteAll() {
        studentService.deleteAll();
        Student student = new Student("mm", (byte) 18);
        studentService.addStudent(student);
        DataBase dataBase = studentService.deleteAll();
        Assert.assertEquals(1, dataBase.getData());
    }

    @Test
    public void queryStudentByName() {
        studentService.deleteAll();
        Student student = new Student("mm", (byte) 18);
        studentService.addStudent(student);
        DataBase<Student> dataBase = studentService.queryStudentByName("mm");
        Assert.assertNotNull(dataBase.getData());
    }

    @Test
    public void queryAllStudent() {
        studentService.deleteAll();
        Student student = new Student("mm", (byte) 18);
        studentService.addStudent(student);
        studentService.addStudent(student);
        DataBase<List<Student>> dataBase = studentService.queryAllStudent();
        Assert.assertEquals(2, dataBase.getData().size());
    }
}