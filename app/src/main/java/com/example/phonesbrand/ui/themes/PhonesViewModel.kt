package com.example.phonesbrand.ui.themes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phonesbrand.domain.useCase.PhonesUseCase
import com.example.phonesbrand.ui.model.PhoneUiModel
import com.example.phonesbrand.ui.model.toUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class PhonesViewModel(val phonesUseCase: PhonesUseCase) : ViewModel() {
    private val _phonesType: MutableStateFlow<PhoneUiModel?> = MutableStateFlow(null)
    public val phoneType: StateFlow<PhoneUiModel?> = _phonesType
    fun getPhoneType() {
        viewModelScope.launch {
            //_phonesType.value = phonesUseCase.getPhoneTypeUseCase().toUiModel()
            phonesUseCase.getPhoneTypeUseCase().collect() {
                _phonesType.emit(it.toUiModel())
            }
        }
    }
}