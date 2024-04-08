package com.sky.service;

import com.sky.dto.CategoryDTO;

/**
 * @author Quent1n23
 * @version 1.0
 */
public interface CategoryService {
    /**
     * 新增分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);
}
