/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse105.model;

import java.util.Date;

/**
 *
 * @author Hsu
 */
public class Appointment {
    private Date date; // 预约日期
    private String title; // 预约事项
    private String location; // 预约地点
    private String time; // 预约时间

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    
}
