package com.tms.app.homework17.restApi

import com.tms.app.homework17.data.Crypto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.properties.Delegates

class CryptoRepository(
    private val cryptoApi: CryptoApi
) {

    fun getLimit(limit: Int): Int{
        val myLimit = limit
        return limit
    }

    var limit by Delegates.notNull<Int>()


    suspend fun getCurrencyList(): List<Crypto> = withContext(Dispatchers.IO){
      cryptoApi.getCurrencyList(limit).data.map {
          Crypto(id = it.id,name = it.name, rank = it.rank)
      }


    }
}