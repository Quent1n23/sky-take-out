package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @author Quent1n23
 * @version 1.0
 */
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
