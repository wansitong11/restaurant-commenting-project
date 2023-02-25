package com.restaurant_commenting.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.restaurant_commenting.dto.Result;
import com.restaurant_commenting.entity.Blog;


public interface IBlogService extends IService<Blog> {
    Result queryHotBlog(Integer current);

    Result queryBlogById(Long id);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);
}
