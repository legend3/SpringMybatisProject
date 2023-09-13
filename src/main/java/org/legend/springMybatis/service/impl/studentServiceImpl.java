package org.legend.springMybatis.service.impl;

import org.legend.springMybatis.entity.Student;
import org.legend.springMybatis.add.addStudentMapper;
import org.legend.springMybatis.select.selectStudentMapper;
import org.legend.springMybatis.service.IStudentService;

import java.util.List;

public class studentServiceImpl implements IStudentService {
    private addStudentMapper addstudentMapper;//service调dao
    private selectStudentMapper selectstudentMapper;

    public void setAddstudentMapper(addStudentMapper addstudentMapper) {
        this.addstudentMapper = addstudentMapper;
    }

    public void setSelectstuentMapper(selectStudentMapper selectstudentMapper) {
        this.selectstudentMapper = selectstudentMapper;
    }

    @Override
    public void add(Student student) {
        //调用Dao层
        addstudentMapper.addStudent(student);
    }

    @Override
    public List<Student> select() {
        return selectstudentMapper.selectStudent();
    }
}
