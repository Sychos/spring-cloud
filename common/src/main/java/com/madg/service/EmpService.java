package com.madg.service;

import com.madg.dao.EmpMapper;
import com.madg.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements EmpMapper
{
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp selectByPrimaryKey(Integer id)
    {
        return empMapper.selectByPrimaryKey(id);
    }
}
