package com.hv.ats.controller;

import com.hv.ats.dto.ApplicationDto;
import com.hv.ats.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApplicationController {

    private ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/applications")
    public String getApplications(Model model){
        List<ApplicationDto> applicationDtoList = applicationService.findAll();
        model.addAttribute("applications", applicationDtoList);
        return "applications-list";

    }
}
