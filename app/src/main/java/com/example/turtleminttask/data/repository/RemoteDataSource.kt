package com.example.turtleminttask.data.repository

import com.example.turtlemStringtask.data.api.model.IssuesResponse
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response

interface RemoteDataSource {
    fun getIssues(): Observable<Response<ResponseBody>>
    fun getComments(id: String): Observable<Response<ResponseBody>>
}