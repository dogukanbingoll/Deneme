package com.etiya.northwind.Services.Concretes;

import com.etiya.northwind.Services.Abstracts.ICartService;
import com.etiya.northwind.Services.requests.Cart.CreateCartRequest;
import com.etiya.northwind.Services.requests.Cart.UpdateCartRequest;
import com.etiya.northwind.Repository.CartRepository;
import com.etiya.northwind.Utility.ModelMapperService;
import com.etiya.northwind.Entities.Concretes.Cart;
import com.etiya.northwind.core.utilities.results.Result;
import com.etiya.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImp implements ICartService {

    private CartRepository cartRepository;
    private ModelMapperService modelMapperService;

    @Autowired
    public CartServiceImp(CartRepository cartRepository, ModelMapperService modelMapperService) {
        this.cartRepository = cartRepository;
        this.modelMapperService=modelMapperService;
    }

    @Override
    public Result addCart(CreateCartRequest createCartRequest) {
        this.cartRepository.save(modelMapperService.forRequest().map(createCartRequest, Cart.class));
        return new SuccessResult("Eklendi");
    }

    @Override
    public Result updateCart(UpdateCartRequest updateCartRequest) {
        this.cartRepository.save(modelMapperService.forRequest().map(updateCartRequest,Cart.class));
        return new SuccessResult("Güncellendi");
    }

    @Override
    public Result deleteCart(int cartId) {
        this.cartRepository.deleteById(cartId);
        return new SuccessResult("Silindi");
    }

    public Result deleteCart(String custId){
        this.cartRepository.deleteAllByCustomer_CustomerId(custId);
        return new SuccessResult("Silindi");
    }


}
