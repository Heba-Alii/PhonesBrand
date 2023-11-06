package com.example.phonesbrand.ui.di

import com.example.phonesbrand.data.dataSource.local.LocalDataSource
import com.example.phonesbrand.data.repo.RepoImpl
import com.example.phonesbrand.domain.repo.PhonesRepoInterface
import com.example.phonesbrand.domain.useCase.PhonesUseCase
import com.example.phonesbrand.ui.themes.PhonesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { LocalDataSource() }
    single<PhonesRepoInterface> { RepoImpl(get()) }
    single { PhonesUseCase(phonesRepo = get()) }
}
val phoneViewModels = module {
    viewModel {
        // PhonesViewModel(phonesUseCase = get() as PhonesUseCase)
        PhonesViewModel(get() as PhonesUseCase)
    }
}