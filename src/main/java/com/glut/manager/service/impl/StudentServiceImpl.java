package com.glut.manager.service.impl;

import com.glut.manager.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {
}
