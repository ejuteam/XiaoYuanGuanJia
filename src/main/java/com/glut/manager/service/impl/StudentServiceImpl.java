package com.glut.manager.service.impl;

import com.glut.manager.domain.StudentDTO;
import com.glut.manager.mapper.StudentMapper;
import com.glut.manager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public StudentDTO selectUser(String account, String password) {
        return studentMapper.selectUser(account,password);
    }
}
