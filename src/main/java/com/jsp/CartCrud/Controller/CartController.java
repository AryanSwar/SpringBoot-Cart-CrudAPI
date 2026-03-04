package com.jsp.CartCrud.Controller;

import com.jsp.CartCrud.model.Cart;
import com.jsp.CartCrud.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor    //using this to don't need to use autowired
@RequestMapping("/cart")    //using this no need to pass endpoint separate, passing when using same RestAPI then i pass different endpoint
public class CartController {

//    @Autowired
    private final CartService service;

    //creating documentation of project of Student-crud1
    @Operation(summary = "create object of Cart")
    @ApiResponse(responseCode = "201", description = "it will create object")
    @ApiResponse(responseCode = "400", description = "invalid data")
    @ApiResponse(responseCode = "500", description = "internal server error")

//    @PostMapping("/cart/save")
    @PostMapping
    public Cart save(@RequestBody Cart cart)
    {
        return service.saveCart(cart);
    }

//    @GetMapping("/cart/find")
    @GetMapping
    public Cart find(@RequestParam int id)
    {
        return service.findCart(id);
    }

//    @PutMapping("/cart/update")
    @PutMapping
    public Cart update(@RequestBody Cart cart)
    {
        return service.updateCart(cart);
    }

//    @DeleteMapping("/cart/delete")
    @DeleteMapping
    public String delete(@RequestParam int id)
    {
        service.deleteCart(id);
        return "Cart deleted successfully";
    }
}
