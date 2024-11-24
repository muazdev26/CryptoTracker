package com.muazdev26.cryptotracker.crypto.presentation.coin_list

import com.muazdev26.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
}