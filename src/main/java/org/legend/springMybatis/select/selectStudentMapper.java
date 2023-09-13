package org.legend.springMybatis.select;

import org.legend.springMybatis.entity.Student;

import java.util.List;

/**
 *
 * 本来是IStudentDao(Dao层接口)，为了和mybatis更加紧密改名字为StudentMapper，放入和mapper文件放一起
 */
public interface selectStudentMapper {
    List<Student> selectStudent();
}
