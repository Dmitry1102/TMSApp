package com.tms.app.homework17.entity

import com.google.gson.annotations.SerializedName

data class StatusResponce(
    @SerializedName("credit_count")  val creditCount: Int,
    @SerializedName("elapsed") val elapsed: Int,
    @SerializedName("error_code") val errorCode: Int,
    @SerializedName("error_message") val errorMessage: String,
    @SerializedName("timestamp") val timeStamp: String
)