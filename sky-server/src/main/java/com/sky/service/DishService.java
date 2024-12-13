package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * ClassName: DishService
 * Package: com.sky.service
 * Description: This is a program for testing.
 *
 * @Author Ben
 * @Create 2024/12/12 16:10
 * @Version 1.0
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
