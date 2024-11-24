package com.muazdev26.cryptotracker.crypto.data.netwroking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinHistoryDto(
    val data: List<CoinPriceDto>
)