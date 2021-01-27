package com.baizhi.dao;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> queryAll();

    Category queryByCateName(String name);

}
