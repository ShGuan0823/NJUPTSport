package com.sg.sportmeeting.service;

import com.sg.sportmeeting.entity.result;


public interface resultService {

    void addResult(result result);

    void deleteResult(long id);

    result findByName(String name);
}
