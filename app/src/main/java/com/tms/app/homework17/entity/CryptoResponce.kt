package com.tms.app.homework17.entity

import com.google.gson.annotations.SerializedName
import okhttp3.internal.platform.Platform

data class CryptoResponce(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("is_active") val isActive: Int,
    @SerializedName("last_historical_data") val lastHistoricalData: String,
    @SerializedName("first_historical_data") val firstHistoricalData: String,
    @SerializedName("rank") val rank: Int,
    @SerializedName("slug") val slug: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("platform") val platform: Platform?
)