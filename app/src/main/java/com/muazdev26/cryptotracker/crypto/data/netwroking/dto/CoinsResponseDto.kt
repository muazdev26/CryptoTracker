package com.muazdev26.cryptotracker.crypto.data.netwroking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)