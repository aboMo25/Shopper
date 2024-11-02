package com.domain.usecase

import com.domain.model.request.AddCartRequestModel
import com.domain.repository.CartRepository

class AddToCartUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(request: AddCartRequestModel) = cartRepository.addProductToCart(request)
}