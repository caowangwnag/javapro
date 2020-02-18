package com.neudeu.service;

import com.neudeu.dao.IstudentDao;
import com.neudeu.dao.StudentDao;
import com.neudeu.pojo.Student;

import java.util.List;

public class StudentService implements IstudentService{
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int Sno) {
        return studentDao.del(Sno);
    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
