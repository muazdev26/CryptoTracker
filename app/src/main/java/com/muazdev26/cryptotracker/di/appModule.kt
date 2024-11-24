package com.muazdev26.cryptotracker.di

import com.muazdev26.cryptotracker.core.data.networking.HttpClientFactory
import com.muazdev26.cryptotracker.crypto.data.netwroking.RemoteCoinDataSource
import com.muazdev26.cryptotracker.crypto.domain.CoinDataSource
import com.muazdev26.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}