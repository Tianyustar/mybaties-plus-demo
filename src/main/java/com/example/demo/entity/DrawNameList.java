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
public class DrawNameList implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studentName;
    private Integer studentId;
    private Integer groupId;
    private String groupName;
    private Integer drawId;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getDrawId() {
        return drawId;
    }

    public void setDrawId(Integer drawId) {
        this.drawId = drawId;
    }

    @Override
    public String toString() {
        return "DrawNameList{" +
        ", studentName=" + studentName +
        ", studentId=" + studentId +
        ", groupId=" + groupId +
        ", groupName=" + groupName +
        ", drawId=" + drawId +
        "}";
    }
}
