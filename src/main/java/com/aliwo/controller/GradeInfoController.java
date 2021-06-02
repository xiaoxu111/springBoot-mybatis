package com.aliwo.controller;

import com.aliwo.entity.GradeInfo;
import com.aliwo.service.GradeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xuyayuan
 * @data 2021年06月01日
 */
@Controller
public class GradeInfoController {

    @Autowired
    private GradeInfoService gradeInfoService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insertGradeInfo(GradeInfo gradeInfo, Model model ) {
        gradeInfo.setGradeName(gradeInfo.getGradeName());
        gradeInfo.setGradeNo(gradeInfo.getGradeNo());
        model.addAttribute("gradeInfo");
        gradeInfoService.insertGradeInfo(gradeInfo);
        return "jsp/welcome";
    }

}
