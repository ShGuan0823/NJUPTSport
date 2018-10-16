package com.sg.sportmeeting.controller;


import com.sg.sportmeeting.entity.message;
import com.sg.sportmeeting.service.msgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class msgController {

    @Autowired
    private msgService msgService;

    @RequestMapping(value = "/msg/add", method = RequestMethod.POST)
    public String addMsg(message msg){
        msgService.addMessage(msg);
        return "index";
    }

    @RequestMapping(value = "/msg/delete", method = RequestMethod.DELETE)
    public String deleteMsg(long id){
        msgService.deleteMessage(id);
        return "index";
    }

    @RequestMapping(value = "/msg/list", method = RequestMethod.GET)
    public String msgList(Model model){
        List<message> messages = msgService.getList();
        model.addAttribute(messages);
        return "index";
    }

}
