package com.domain.usecase

import com.domain.model.CartItemModel
import com.domain.repository.CartRepository

class UpdateQuantityUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemModel: CartItemModel) = cartRepository.updateQuantity(cartItemModel)
}