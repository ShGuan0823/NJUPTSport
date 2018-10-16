package com.sg.sportmeeting.entity;


import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table(name = "t_msg")
public class message {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_msg")
    private String msg;

    @Column(name = "t_time")
    private String time;


    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
