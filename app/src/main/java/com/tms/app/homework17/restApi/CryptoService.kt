package com.tms.app.homework17.restApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CryptoService {

    private const val URL = "https://pro-api.coinmarketcap.com"

    const val KEY = "e681061d-8937-4323-a4f2-20ed82837758"
    const val DEFAULT_LIMIT = 10000

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCryptoService() : CryptoApi = getRetrofit().create(CryptoApi::class.java)
}