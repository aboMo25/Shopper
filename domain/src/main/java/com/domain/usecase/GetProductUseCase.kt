package com.domain.usecase

import com.domain.repository.ProductRepository

class GetProductUseCase(private val repository: ProductRepository){
    suspend fun execute (category: Int?)=repository.getProducts(category)

}