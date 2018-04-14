package com.example.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author libre
 * @since 2018-04-14
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studentName;
    private Integer studentNum;
    private String password;
    private String gendar;
    private String phone;
    private String email;
    private String headImg;
    private Integer studentClass;
    private String role;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
        ", studentName=" + studentName +
        ", studentNum=" + studentNum +
        ", password=" + password +
        ", gendar=" + gendar +
        ", phone=" + phone +
        ", email=" + email +
        ", headImg=" + headImg +
        ", studentClass=" + studentClass +
        ", role=" + role +
        "}";
    }
}
