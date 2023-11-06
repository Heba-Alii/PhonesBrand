package com.example.phonesbrand.data.dataSource.local

import com.example.phonesbrand.data.model.PhonesResponse

class LocalDataSource {
    fun getPhones(): List<PhonesResponse> {
        return mutableListOf(
            PhonesResponse('s'),
            PhonesResponse('s'),
            PhonesResponse('i'),
            PhonesResponse('i')
        )
    }
}