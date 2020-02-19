package com.neudeu.pojo;

import com.neudeu.util.Column;

public class Course {
    private Integer Cno;
    private String Cname;
    @Column("Period")
    private Integer Period;
    private Integer Ccredit;

    public Course() {
    }

    public Course(Integer cno, String cname, Integer period, Integer ccredit) {
        Cno = cno;
        Cname = cname;
        Period = period;
        Ccredit = ccredit;
    }

    public Integer getCno() {
        return Cno;
    }

    public void setCno(Integer cno) {
        Cno = cno;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Integer getPeriod() {
        return Period;
    }

    public void setPeriod(Integer period) {
        Period = period;
    }

    public Integer getCcredit() {
        return Ccredit;
    }

    public void setCcredit(Integer ccredit) {
        Ccredit = ccredit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Cno=" + Cno +
                ", Cname='" + Cname + '\'' +
                ", Period=" + Period +
                ", Ccredit=" + Ccredit +
                '}';
    }
}
