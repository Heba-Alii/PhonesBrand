package com.example.phonesbrand.data.dataSource.remote

import com.example.phonesbrand.data.model.PhonesResponse
import retrofit2.http.GET

interface ApiService {
    companion object {
        private const val Type = "Type.com"
    }
    @GET(Type)
    fun getPhoneType(): PhonesResponse
}