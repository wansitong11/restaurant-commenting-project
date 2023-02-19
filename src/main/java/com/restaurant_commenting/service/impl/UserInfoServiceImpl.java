package com.restaurant_commenting.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.restaurant_commenting.entity.UserInfo;
import com.restaurant_commenting.mapper.UserInfoMapper;
import com.restaurant_commenting.service.IUserInfoService;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
