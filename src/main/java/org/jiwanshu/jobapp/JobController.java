package org.jiwanshu.jobapp;

import org.jiwanshu.jobapp.model.JobPost;
import org.jiwanshu.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs= service.returnAllJobPosts();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }
}
