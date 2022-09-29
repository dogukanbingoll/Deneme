package com.etiya.northwind.Services.Abstracts;

import com.etiya.northwind.Services.requests.Cart.CreateCartRequest;
import com.etiya.northwind.Services.requests.Cart.UpdateCartRequest;
import com.etiya.northwind.core.utilities.results.Result;

public interface ICartService {
    addCart(CreateCartRequest createCartRequest);
   Result updateCart(UpdateCartRequest updateCartRequest);
   Result deleteCart(int cartId);
   Result deleteCart(String customerId);
}
