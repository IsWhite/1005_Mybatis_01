package com.ssm.test;

import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.page.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 跑一下dao层
 */
public class MainTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");

    }}
//
//    @Test
//    public void testMapper() {
//        /*获得mybatis,student代理对象(配置代理类才可以调用)*/
//        StudentMapper studentMapper =
//                context.getBean(StudentMapper.class);
//
//        List<Student> students = studentMapper.selectAll();
//        System.out.println(students);
//
//        /*获取总条数*/
//
//        int count = studentMapper.getTotalRecord();
//
//        System.out.println(count);
//
//        /*分页查询*/
//        PageBean<Student> pageBean =new PageBean<Student>(1,3,count);
//
//        System.out.println(studentMapper.pageSelect(pageBean));
//    }
//
//    @Test
//    public  void  testPageSelect(){
//        StudentMapper studentMapper= context.getBean(StudentMapper.class);
//
//        int total =studentMapper.getTotalRecord();
//
//        PageBean<Student> pageBean =new PageBean<Student>(1,3,total);
//        Student param =new Student();
//        param.setSname("飞");
//        pageBean.setParameter(param);
//
//        List<Student> students =studentMapper.pageSelect(pageBean);
//        System.out.println(students);
//    }
//
//
//}
