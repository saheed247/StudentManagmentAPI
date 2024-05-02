package com.schoolProject.schoolmanagement.controller;

import com.schoolProject.schoolmanagement.entity.School;
import com.schoolProject.schoolmanagement.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/schoolcontrol")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("/saveschool")
    public String saveSchool(@RequestBody School school){
        SchoolService.saveSchool(school);
        return "good";

    }

    @GetMapping("/")
    public List<School> getSchool(){
        return schoolService.getSchool();

    }

    @GetMapping("")
    public void getSchoolByid(@PathVariable int id){
        schoolService.getSchoolByid(id);
    }

    @DeleteMapping("/")
    public void deleteSchoolByid(@PathVariable int id){
        schoolService.deleteSchoolByid(id);
    }







}
