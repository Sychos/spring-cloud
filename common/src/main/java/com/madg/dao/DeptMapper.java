package com.madg.dao;

import com.madg.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
    Dept selectByPrimaryKey(Integer id);
}