package com.mm.spring.cloud.mapper;

import com.mm.spring.cloud.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);

    @Delete("delete from student where name = #{name}")
    int deleteStudentByName(String name);

    @Delete("delete from student")
    int deleteAll();

    @Select("select * from student where name = #{name}  limit 1")
    Student queryStudentByName(String name);

    @Select("select * from student")
    List<Student> queryAllStudent();
}