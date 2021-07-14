package com.tms.app.homework17.entity

import com.google.gson.annotations.SerializedName
import com.tms.app.homework17.data.Crypto

data class DataResponce(
    @SerializedName("data") val data: List<CryptoResponce>,
    @SerializedName("status") val status: StatusResponce
)
