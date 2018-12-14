package com.mm.springcloud.security.service;

import com.mm.springcloud.security.entity.Blog;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/5/15.
 */
public interface IBlogService {
    List<Blog> getBlogs();

    void deleteBlog(long id);
}
