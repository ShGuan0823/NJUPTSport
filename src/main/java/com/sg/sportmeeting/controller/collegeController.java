package com.sg.sportmeeting.controller;


import com.sg.sportmeeting.entity.college;
import com.sg.sportmeeting.service.collegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class collegeController {

    @Autowired
    private collegeService collegeService;


    @RequestMapping(value = "/college/add", method = RequestMethod.POST)
    public String  addCollege(college college){
        collegeService.saveCollege(college);
        return "index";
    }

    @RequestMapping(value = "/college/list", method = RequestMethod.GET)
    public String list(Model model){
        List<college> colleges =collegeService.getList();
        model.addAttribute(colleges);
        return "index";
    }

    @RequestMapping(value = "/college/delete", method = RequestMethod.DELETE)
    public String delCollege(long id){
        collegeService.deleteCollege(id);
        return "index";
    }

    @RequestMapping(value = "/college/edit", method = RequestMethod.POST)
    public String editCollege(@RequestBody college college){
        collegeService.editScore(college);
        return "index";
    }

}
