package com.glut.manager.mapper;

import com.glut.manager.domain.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    public StudentDTO selectUser(String account,String password);
}
