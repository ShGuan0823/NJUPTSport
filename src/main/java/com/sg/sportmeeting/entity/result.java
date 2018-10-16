package com.sg.sportmeeting.entity;


import javax.persistence.*;

@Entity
@Table(name = "t_result")
public class result {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "t_name")
    private String gameName;

    @Column(name = "t_stuname1")
    private String stuName1;

    @Column(name = "t_stuname2")
    private String stuName2;

    @Column(name = "t_stuname3")
    private String stuName3;

    @Column(name = "t_stunum1")
    private String stuNum1;

    @Column(name = "t_stunum2")
    private String stuNum2;

    @Column(name = "t_stunum3")
    private String stuNum3;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setStuName1(String stuName1) {
        this.stuName1 = stuName1;
    }

    public void setStuName2(String stuName2) {
        this.stuName2 = stuName2;
    }

    public void setStuName3(String stuName3) {
        this.stuName3 = stuName3;
    }

    public void setStuNum1(String stuNum1) {
        this.stuNum1 = stuNum1;
    }

    public void setStuNum2(String stuNum2) {
        this.stuNum2 = stuNum2;
    }

    public String getGameName() {
        return gameName;
    }

    public String getStuName1() {
        return stuName1;
    }

    public String getStuName2() {
        return stuName2;
    }

    public String getStuName3() {
        return stuName3;
    }

    public void setStuNum3(String stuNum3) {
        this.stuNum3 = stuNum3;
    }



    public String getStuNum1() {
        return stuNum1;
    }

    public String getStuNum2() {
        return stuNum2;
    }

    public String getStuNum3() {
        return stuNum3;
    }


}
