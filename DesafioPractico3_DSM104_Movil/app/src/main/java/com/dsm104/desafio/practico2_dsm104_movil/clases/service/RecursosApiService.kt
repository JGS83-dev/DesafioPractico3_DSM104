package com.dsm104.desafio.practico2_dsm104_movil.clases.service

import com.dsm104.desafio.practico2_dsm104_movil.clases.body.RecursosResponse
import retrofit2.Call
import retrofit2.http.GET

interface RecursosApiService {
    @GET("recursos")
    fun callResources(): Call<List<RecursosResponse>>
}