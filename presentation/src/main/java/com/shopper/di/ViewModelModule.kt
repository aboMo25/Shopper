package com.shopper.di

import com.shopper.ui.feature.cart.CartViewModel
import com.shopper.ui.feature.home.HomeViewModel
import com.shopper.ui.feature.prodict_details.ProductDetailsViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(get(), get())
    }
    viewModel {
        ProductDetailsViewModel(get())
    }
    viewModel {
        CartViewModel(get(),get(),get())
    }
}