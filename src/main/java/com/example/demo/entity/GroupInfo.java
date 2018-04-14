package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author libre
 * @since 2018-04-14
 */
public class GroupInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer groupId;
    private String groupName;
    private Date createTime;
    private Integer drawId;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDrawId() {
        return drawId;
    }

    public void setDrawId(Integer drawId) {
        this.drawId = drawId;
    }

    @Override
    public String toString() {
        return "GroupInfo{" +
        ", groupId=" + groupId +
        ", groupName=" + groupName +
        ", createTime=" + createTime +
        ", drawId=" + drawId +
        "}";
    }
}
