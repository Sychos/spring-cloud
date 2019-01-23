package com.madg.server.service;

import com.madg.server.dao.UserMapper;
import com.madg.server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserMapper
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id)
    {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record)
    {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record)
    {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id)
    {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record)
    {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record)
    {
        return userMapper.updateByPrimaryKey(record);
    }
}
