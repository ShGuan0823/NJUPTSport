package com.sg.sportmeeting.controller;


import com.sg.sportmeeting.entity.result;
import com.sg.sportmeeting.service.resultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/result")
public class resultController {

    @Autowired
    private resultService resultService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addResult(result result){
        resultService.addResult(result);
        return "index";
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public String deleteResult(long id){
        resultService.deleteResult(id);
        return "index";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public result findResult(String name){
        return resultService.findByName(name);
    }

}
