//package com.example.phonesbrand.data.dataSource.remote
//
//import com.example.phonesbrand.data.model.PhonesResponse
//import kotlinx.coroutines.delay
//import retrofit2.Retrofit
//
//class PhoneApiClient : PhonesRemoteSource {
//    override suspend fun getAllPhones(): PhonesResponse {
//        val phoneType = PhonesResponse("s", "samsung")
//        return phoneType
//    }
//
//    companion object {
//        val retrofit = Retrofit.Builder().baseUrl("").build()
//        val apiService = retrofit.create(PhonesRemoteSource::class.java)
//    }
//}