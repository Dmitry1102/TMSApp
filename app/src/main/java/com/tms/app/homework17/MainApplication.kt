package com.tms.app.homework17

import android.app.Application
import com.tms.app.homework17.entity.DataResponce
import com.tms.app.homework17.restApi.CryptoRepository
import com.tms.app.homework17.restApi.CryptoService
import java.lang.Appendable

class MainApplication: Application() {

    val cryptoRepository: CryptoRepository by lazy {
        CryptoRepository(CryptoService.getCryptoService())
    }

}