package org.legend.springMybatis.add;

import org.legend.springMybatis.entity.Student;

/**
 *
 * 本来是IStudentDao(Dao层接口)，为了和mybatis更加紧密改名字为StudentMapper，放入和mapper文件放一起
 */
public interface addStudentMapper {
    void addStudent(Student student);
}
