package com.madg.dao;

import com.madg.entity.Emp;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmpMapper {
    Emp selectByPrimaryKey(Integer id);
}