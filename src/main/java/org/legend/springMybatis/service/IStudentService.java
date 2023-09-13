package org.legend.springMybatis.service;

import org.legend.springMybatis.entity.Student;

import java.util.List;

public interface IStudentService {
    public void add(Student student);
    List<Student> select();
}
