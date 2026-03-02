package com.jsp.CartCrud.Controller;

import com.jsp.CartCrud.model.Cart;
import com.jsp.CartCrud.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    CartService service;

    @PostMapping("/cart/save")
    public Cart save(@RequestBody Cart cart)
    {
        return service.saveCart(cart);
    }

    @GetMapping("/cart/find")
    public Cart find(@RequestParam int id)
    {
        return service.findCart(id);
    }

    @PutMapping("/cart/update")
    public Cart update(@RequestBody Cart cart)
    {
        return service.updateCart(cart);
    }

    @DeleteMapping("/cart/delete")
    public String delete(@RequestParam int id)
    {
        service.deleteCart(id);
        return "Cart deleted successfully";
    }
}
