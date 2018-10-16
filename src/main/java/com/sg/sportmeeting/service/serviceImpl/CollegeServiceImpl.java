package com.sg.sportmeeting.service.serviceImpl;


import com.sg.sportmeeting.entity.college;
import com.sg.sportmeeting.repository.collegeJpa;
import com.sg.sportmeeting.service.collegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements collegeService {

    @Autowired
    private collegeJpa collegeJpa;

    public List<college> getList(){
        return collegeJpa.findAll();
    }

    @Override
    public void editScore(college college) {
        collegeJpa.save(college);
    }

    @Override
    public void saveCollege(college college) {
        collegeJpa.save(college);
    }

    @Override
    public void deleteCollege(long id) {
        collegeJpa.deleteById(id);
    }



}
