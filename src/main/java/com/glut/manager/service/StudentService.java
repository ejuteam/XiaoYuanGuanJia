package com.glut.manager.service;

import com.glut.manager.domain.StudentDTO;

public interface StudentService {

    public StudentDTO selectUser(String account, String password);
}
