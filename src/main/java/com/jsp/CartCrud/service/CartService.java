package com.jsp.CartCrud.service;

import com.jsp.CartCrud.model.Cart;

public interface CartService {
    Cart saveCart(Cart cart);

    Cart findCart(int id);

    Cart updateCart(Cart cart);

    void deleteCart(int id);
}
