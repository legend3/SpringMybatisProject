package org.legend.springMybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.legend.springMybatis.entity.Student;
import org.legend.springMybatis.add.addStudentMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;


/**
 * 第一种方式时用: studentDaoImpl实现接口,完成SqlSession(SqlSessionDaoSupport中的属性)的创建
 * @author Administrator
 *
 */
public class studentDaoImpl extends SqlSessionDaoSupport implements addStudentMapper {
    @Override
    public void addStudent(Student student) {
        /*
         * 2.studentDaoImpl继承SqlSessionDaoSupport;
         * 让studentDaoImpl具有sqlSessionFactory属性(在bean中完成属性值注入);
         * 从而能创建SqlSession对象
         */
        SqlSession session = super.getSqlSession();//父类实例获取SqlSession属性
        addStudentMapper stuDao = session.getMapper(addStudentMapper.class);
        stuDao.addStudent(student);//接口映射会根据映射文件中sql自动实现接口方法(仅第一种方式时用！)
        //不需要session.commit(),spring方式都是自动提交
    }
}
