package com.mm.spring.cloud.server;

import com.mm.spring.cloud.bean.DataBase;
import com.mm.spring.cloud.bean.Student;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/13  16:03
 * @Description:
 */
public interface IStudentService {

    DataBase addStudent(Student student);

    DataBase deleteStudentByName(String name);

    DataBase deleteAll();

    DataBase queryStudentByName(String name);

    DataBase queryAllStudent();
}
