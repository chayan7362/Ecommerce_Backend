package com.ecommerce.service;

import com.ecommerce.exception.ProductException;
import com.ecommerce.module.Cart;
import com.ecommerce.module.CartItem;
import com.ecommerce.module.User;
import com.ecommerce.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
