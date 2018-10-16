package com.sg.sportmeeting.entity;


import javax.persistence.*;

@Entity
@Table(name = "t_college")
public class college {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_score")
    private int score;


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

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
