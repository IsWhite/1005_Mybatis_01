package com.ssm.controller;

import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

import javax.annotation.Resource;
import java.util.List;

/**
 * 控制层
 */
@Controller
public class StudentController {

    /*声明service层中的对外接口对象*/
    @Resource
    private StudentService studentService;

    //配置起始页
    @RequestMapping(value = {"","/"})
    public String index(){

        return "index";
    }
    /*获取学生列表数据,用于前端页面表格显示
    * 返回数据json格式进行返回
    * */
    @RequestMapping(value = "/searchStudent")
    @ResponseBody
    public BaseResult<Student> searchStudent(){
        List<Student> students =studentService.selectAll();
        /*将查询到的结果集进行封装*/
        BaseResult<Student> result= new BaseResult<Student>();
        result.setTotal(100);
        result.setData(students);
        return result;
    }

    /*分页查询
    * pageIndex 和pageSize分别是miniui前端传递过来的参数
    *
    * */
    @RequestMapping(value = "/findStudent")
    @ResponseBody
    public BaseResult<Student> findStudent(int pageIndex ,int pageSize,Student student){
        //在方法里定义参数就能接收前端数据

        BaseResult<Student> result =studentService.pageSelect(pageIndex,pageSize,student);

                return  result;
    }


}
