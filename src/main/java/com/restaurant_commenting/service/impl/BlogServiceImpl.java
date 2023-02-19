package com.restaurant_commenting.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.restaurant_commenting.entity.Blog;
import com.restaurant_commenting.mapper.BlogMapper;
import com.restaurant_commenting.service.IBlogService;
import org.springframework.stereotype.Service;


@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
