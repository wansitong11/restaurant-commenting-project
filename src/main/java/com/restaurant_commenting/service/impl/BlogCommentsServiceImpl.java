package com.restaurant_commenting.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.restaurant_commenting.entity.BlogComments;
import com.restaurant_commenting.mapper.BlogCommentsMapper;
import com.restaurant_commenting.service.IBlogCommentsService;
import org.springframework.stereotype.Service;


@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
