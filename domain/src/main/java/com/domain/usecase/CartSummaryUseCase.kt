package com.domain.usecase

import com.domain.repository.CartRepository

class CartSummaryUseCase (private val repository: CartRepository) {
    suspend fun execute(userId: Int) = repository.getCartSummary(userId)
}