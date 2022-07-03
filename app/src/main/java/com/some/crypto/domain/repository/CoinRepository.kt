package com.some.crypto.domain.repository

import com.some.crypto.data.remote.dto.CoinDetailDto
import com.some.crypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}