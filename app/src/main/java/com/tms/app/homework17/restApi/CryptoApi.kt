package com.tms.app.homework17.restApi

import com.tms.app.homework17.entity.CryptoResponce
import com.tms.app.homework17.entity.DataResponce
import com.tms.app.homework17.restApi.CryptoService.DEFAULT_LIMIT
import com.tms.app.homework17.restApi.CryptoService.KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import kotlin.properties.Delegates

interface CryptoApi {




    @Headers("X-CMC_PRO_API_KEY: ${KEY}")
    @GET("v1/cryptocurrency/map")
    fun getCurrencyList(
        @Query("limit") limit: Int
    ): DataResponce
}