package com.data.di

import com.data.repository.CartRepositoryImpl
import com.data.repository.CategoryRepositoryImpl
import com.data.repository.ProductRepositoryImpl
import com.domain.repository.CartRepository
import com.domain.repository.CategoryRepository
import com.domain.repository.ProductRepository
import org.koin.dsl.module

val  repositoryModule = module {
    single <ProductRepository> { ProductRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
    single<CartRepository> { CartRepositoryImpl(get()) }

}