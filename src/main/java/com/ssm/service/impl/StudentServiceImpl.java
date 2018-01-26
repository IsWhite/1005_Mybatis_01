package com.ssm.service.impl;

import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.page.PageBean;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务层
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    /*service层调用持久层的接口对象声明*/
    @Resource
    private StudentMapper studentMapper;


    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    /*分页查询:
    * 模糊查询:后加的参数student 接收前端页码传递过来的参数
    * */
    public BaseResult<Student> pageSelect(int pageIndex, int pageSize,Student student) {
        BaseResult<Student> result =new BaseResult<Student>();

        PageBean<Student> pg =new PageBean<Student>(1,3,3);
        pg.setParameter(student);

        /*获得总条数*/
        int total  =studentMapper.getTotalRecord(pg);
        /*构建分页对象*/
        PageBean<Student> pageBean=new PageBean<Student>(pageIndex+1,pageSize,total);

        /*更新分页查询的参数*/
        pageBean.setParameter(student);

        /*获取当前页数据*/
        List<Student> datas =studentMapper.pageSelect(pageBean);
        /*将总记录数与当前页data数据设置到baseResult对象中*/
        result.setTotal(total);
        result.setData(datas);
        return result;

    }
}
