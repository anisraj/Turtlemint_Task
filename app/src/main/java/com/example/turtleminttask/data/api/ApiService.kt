package com.example.turtleminttask.data.api

import com.example.turtlemStringtask.data.api.model.IssuesResponse
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("issues")
    fun getIssues(): Observable<Response<ResponseBody>>

    @GET("issues/{commentId}/comments")
    fun getComments(
        @Path("commentId") id: String
    ): Observable<Response<ResponseBody>>

}