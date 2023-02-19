package com.restaurant_commenting.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.restaurant_commenting.dto.LoginFormDTO;
import com.restaurant_commenting.dto.Result;
import com.restaurant_commenting.entity.User;

import javax.servlet.http.HttpSession;


public interface IUserService extends IService<User> {

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sendCode(String phone, HttpSession session);
}
