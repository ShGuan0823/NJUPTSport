package com.sg.sportmeeting.service.serviceImpl;

import com.sg.sportmeeting.entity.message;
import com.sg.sportmeeting.repository.msgJpa;
import com.sg.sportmeeting.service.msgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgServiceImpl implements msgService {

    @Autowired
    private msgJpa msgJpa;


    @Override
    public List<message> getList() {
        return msgJpa.findAll();
    }

    @Override
    public void addMessage(message msg) {
        msgJpa.save(msg);
    }

    @Override
    public void deleteMessage(long id) {
        msgJpa.deleteById(id);
    }
}
