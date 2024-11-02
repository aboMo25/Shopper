package com.domain.di

import com.domain.usecase.AddToCartUseCase
import com.domain.usecase.DeleteProductUseCase
import com.domain.usecase.GetCartUseCase
import com.domain.usecase.GetCategoriesUseCase
import com.domain.usecase.GetProductUseCase
import com.domain.usecase.UpdateQuantityUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }
    factory { AddToCartUseCase(get()) }
    factory { GetCartUseCase(get()) }
    factory { UpdateQuantityUseCase(get()) }
    factory { DeleteProductUseCase(get()) }
}