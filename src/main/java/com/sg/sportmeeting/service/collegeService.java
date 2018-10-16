package com.sg.sportmeeting.service;

import com.sg.sportmeeting.entity.college;

import java.util.List;

public interface collegeService {


    List<college> getList();

    void editScore(college college);

    void saveCollege(college college);

    void deleteCollege(long id);
}
