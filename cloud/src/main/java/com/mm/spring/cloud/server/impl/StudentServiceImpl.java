package com.mm.spring.cloud.server.impl;

import com.mm.spring.cloud.bean.DataBase;
import com.mm.spring.cloud.bean.Result;
import com.mm.spring.cloud.bean.Student;
import com.mm.spring.cloud.mapper.StudentMapper;
import com.mm.spring.cloud.server.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/13  16:04
 * @Description:
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public DataBase addStudent(Student student) {
        return Result.OK(studentMapper.insert(student));
    }

    @Override
    public DataBase deleteStudentByName(String name) {
        return Result.OK(studentMapper.deleteStudentByName(name));
    }

    @Override
    public DataBase deleteAll() {
        return Result.OK(studentMapper.deleteAll());
    }

    @Override
    public DataBase queryStudentByName(String name) {
        return Result.OK(studentMapper.queryStudentByName(name));
    }

    @Override
    public DataBase queryAllStudent() {
        return Result.OK(studentMapper.queryAllStudent());
    }
}
