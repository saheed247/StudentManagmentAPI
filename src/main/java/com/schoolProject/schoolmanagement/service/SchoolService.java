package com.schoolProject.schoolmanagement.service;

import com.schoolProject.schoolmanagement.entity.School;
import com.schoolProject.schoolmanagement.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {


    @Autowired
    static
    SchoolRepository schoolRepository;

    public static void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> getSchool() {
        return schoolRepository.findAll();
    }

    public void getSchoolByid(int id) {
        schoolRepository.findById(id);
    }

    public void deleteSchoolByid(int id) {
        schoolRepository.deleteById(id);
    }
}
