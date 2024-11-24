package com.muazdev26.cryptotracker.crypto.data.netwroking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinPriceDto(
    val priceUsd: Double,
    val time: Long
)