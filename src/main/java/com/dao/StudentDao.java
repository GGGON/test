package com.dao;

import com.test.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> selectStudent();

    public int insertStudent(Student student);
}
