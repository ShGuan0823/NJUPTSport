package com.sg.sportmeeting.service.serviceImpl;

import com.sg.sportmeeting.entity.result;
import com.sg.sportmeeting.repository.resultJpa;
import com.sg.sportmeeting.service.resultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResultServiceImpl implements resultService {

    @Autowired
    private resultJpa resultJpa;


    @Override
    public void addResult(result result) {
        resultJpa.save(result);
    }

    @Override
    public void deleteResult(long id) {
        resultJpa.deleteById(id);
    }

    @Override
    public result findByName(String name) {
        return resultJpa.findByName(name);
    }
}
