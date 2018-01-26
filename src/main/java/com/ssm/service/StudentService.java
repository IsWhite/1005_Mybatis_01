package com.ssm.service;

import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */
public interface StudentService {

    List<Student> selectAll();

    /*分页查询
    * @pageIndex 页码 从0开始
    * @pageSize  每页显示的条数
    * @return 返回包含total和data的结果封装对象
    *
    * 通过前端miniui定参数
    * */
  BaseResult<Student> pageSelect(int pageIndex,
                                 int pageSize,
                                 Student student);
}
