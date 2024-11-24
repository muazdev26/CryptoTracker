package com.muazdev26.cryptotracker.crypto.presentation.coin_list

import com.muazdev26.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}