//package com.example.phonesbrand.ui.util
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.phonesbrand.domain.useCase.PhonesUseCase
//import com.example.phonesbrand.ui.themes.PhonesViewModel
//
//class PhonesViewModelFactory(private val phonesUseCase: PhonesUseCase) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return if (modelClass::class.java.isInstance(PhonesViewModel::class.java)) {
//            PhonesViewModel(phonesUseCase) as T
//        } else {
//            throw java.lang.IllegalArgumentException(" Not Fount")
//        }
//    }
//}