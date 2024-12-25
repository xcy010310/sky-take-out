package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * ClassName: ShoppingCartService
 * Package: com.sky.service
 * Description: This is a program for testing.
 *
 * @Author Ben
 * @Create 2024/12/25 16:27
 * @Version 1.0
 */
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
