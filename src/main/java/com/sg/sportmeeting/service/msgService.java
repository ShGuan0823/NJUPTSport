package com.sg.sportmeeting.service;

import com.sg.sportmeeting.entity.message;

import java.util.List;

public interface msgService {

    List<message> getList();

    void addMessage(message msg);

    void deleteMessage(long id);
}
