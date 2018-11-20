package com.mm.spring.cloud.controller;

import com.mm.spring.cloud.bean.DataBase;
import com.mm.spring.cloud.bean.Student;
import com.mm.spring.cloud.server.IStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  10:42
 * @Description:
 */
@RestController
@RequestMapping("/student")
@Api(value = "学生统一接口", description = "学生增删改查")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @ApiOperation(value = "添加一个学生")
    @PostMapping("/add")
    private DataBase addStudent(@RequestBody @ApiParam(name = "student对象") Student student) {
        return studentService.addStudent(student);
    }

    @ApiOperation(value = "根据名字删除学生")
    @PostMapping("/del")
    private DataBase deleteStudentByName(@RequestParam @ApiParam(name = "student name") String name) {
        return studentService.deleteStudentByName(name);
    }

    @ApiOperation(value = "删除所有学生")
    @PostMapping("/delAll")
    private DataBase deleteAll() {
        return studentService.deleteAll();
    }

    @ApiOperation(value = "根据名字查询一个学生")
    @GetMapping("/query")
    private DataBase queryStudentByName(@RequestParam @ApiParam(name = "student name") String name) {
        return studentService.queryStudentByName(name);
    }

    @ApiOperation(value = "查询所有学生")
    @GetMapping("/queryAll")
    private DataBase queryAllStudent() {
        return studentService.queryAllStudent();
    }
}
