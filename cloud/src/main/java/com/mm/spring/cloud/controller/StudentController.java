package com.mm.spring.cloud.controller;

import com.mm.spring.cloud.bean.DataBase;
import com.mm.spring.cloud.bean.Student;
import com.mm.spring.cloud.server.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  10:42
 * @Description:
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/add")
    private DataBase addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/del")
    private DataBase deleteStudentByName(@RequestParam String name) {
        return studentService.deleteStudentByName(name);
    }

    @PostMapping("/delAll")
    private DataBase deleteAll() {
        return studentService.deleteAll();
    }

    @GetMapping("/query")
    private DataBase queryStudentByName(@RequestParam String name) {
        return studentService.queryStudentByName(name);
    }

    @GetMapping("/queryAll")
    private DataBase queryAllStudent() {
        return studentService.queryAllStudent();
    }
}
