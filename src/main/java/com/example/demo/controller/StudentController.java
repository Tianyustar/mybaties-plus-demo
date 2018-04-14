package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import com.example.demo.utils.StringUtil;
import com.example.demo.utils.TMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.rmi.StubNotFoundException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author libre
 * @since 2018-04-14
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    private final IStudentService iStudentService;
    @Autowired
    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }
    @RequestMapping("register")
    public TMessage  register(Student student)
    {
        if (StringUtil.isEmpty(student.getStudentName() )|| StringUtil.isEmpty(student.getPassword())) {
            return new TMessage(TMessage.CODE_FAILURE, "用户名或密码不能为空");
        }
        return iStudentService.register(student);
    }

    @RequestMapping("test")
    public String test() {
        return   "test";
    }
}

