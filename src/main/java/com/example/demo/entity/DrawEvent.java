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
public class DrawEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private String drawName;
    private Integer drawId;
    private String drawDiscribe;
    private Date startTime;
    private Date endTime;
    private Integer groupSum;


    public String getDrawName() {
        return drawName;
    }

    public void setDrawName(String drawName) {
        this.drawName = drawName;
    }

    public Integer getDrawId() {
        return drawId;
    }

    public void setDrawId(Integer drawId) {
        this.drawId = drawId;
    }

    public String getDrawDiscribe() {
        return drawDiscribe;
    }

    public void setDrawDiscribe(String drawDiscribe) {
        this.drawDiscribe = drawDiscribe;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getGroupSum() {
        return groupSum;
    }

    public void setGroupSum(Integer groupSum) {
        this.groupSum = groupSum;
    }

    @Override
    public String toString() {
        return "DrawEvent{" +
        ", drawName=" + drawName +
        ", drawId=" + drawId +
        ", drawDiscribe=" + drawDiscribe +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", groupSum=" + groupSum +
        "}";
    }
}
