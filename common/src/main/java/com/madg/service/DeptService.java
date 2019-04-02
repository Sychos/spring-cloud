package com.madg.service;

import com.madg.dao.DeptMapper;
import com.madg.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService implements DeptMapper
{
    @Autowired
    private DeptMapper deptMapper;



    @Override
    public Dept selectByPrimaryKey(Integer id)
    {
        return deptMapper.selectByPrimaryKey(id);
    }

}
