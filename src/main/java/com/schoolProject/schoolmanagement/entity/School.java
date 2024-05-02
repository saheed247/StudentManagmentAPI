package com.schoolProject.schoolmanagement.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sname;
    private String semail;
    private String saddress;
    private int NOS;
    private int Smobile;
    private String SVC;

    public School() {

    }

    public School(String sname, String semail, String saddress, int NOS, int smobile, String SVC) {
        this.sname = sname;
        this.semail = semail;
        this.saddress = saddress;
        this.NOS = NOS;
        Smobile = smobile;
        this.SVC = SVC;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public int getNOS() {
        return NOS;
    }

    public void setNOS(int NOS) {
        this.NOS = NOS;
    }

    public int getSmobile() {
        return Smobile;
    }

    public void setSmobile(int smobile) {
        Smobile = smobile;
    }

    public String getSVC() {
        return SVC;
    }

    public void setSVC(String SVC) {
        this.SVC = SVC;
    }
}