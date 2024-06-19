package com.example.speaktoo.api

import com.example.speaktoo.models.LoginResponse
import com.example.speaktoo.models.SignupResponse
import com.example.speaktoo.models.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/email/signup")
    fun signup(@Body user: User): Call<SignupResponse>

    @POST("/email/login")
    fun login(@Body user: User): Call<LoginResponse>
}