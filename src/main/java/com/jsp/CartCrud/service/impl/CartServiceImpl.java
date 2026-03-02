package com.jsp.CartCrud.service.impl;

import com.jsp.CartCrud.model.Cart;
import com.jsp.CartCrud.repository.CartRepository;
import com.jsp.CartCrud.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart saveCart(Cart cart)
    {
        return cartRepository.save(cart);
    }

    @Override
    public Cart findCart(int id)
    {
        return cartRepository.findById(id).orElseThrow(()->new RuntimeException("Cart not found"));
    }

    @Override
    public Cart updateCart(Cart cart)
    {
        Cart cart1 = cartRepository.findById(cart.getId()).orElseThrow(()->new RuntimeException("Cart not found"));
        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(int id)
    {
        Cart cart = cartRepository.findById(id).orElseThrow(()->new RuntimeException("Cart not found"));
        cartRepository.delete(cart);
    }
}
