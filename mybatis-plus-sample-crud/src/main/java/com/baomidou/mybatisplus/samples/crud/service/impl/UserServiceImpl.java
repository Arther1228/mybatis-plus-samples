package com.baomidou.mybatisplus.samples.crud.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.crud.entity.User;
import com.baomidou.mybatisplus.samples.crud.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.crud.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author nieqiuqiu
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
