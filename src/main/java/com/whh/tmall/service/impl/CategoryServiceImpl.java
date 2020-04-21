package com.whh.tmall.service.impl;

import com.whh.tmall.mapper.CategoryMapper;
import com.whh.tmall.pojo.Category;
import com.whh.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
