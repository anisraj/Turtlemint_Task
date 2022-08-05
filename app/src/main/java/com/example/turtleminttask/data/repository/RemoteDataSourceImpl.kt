package com.example.turtleminttask.data.repository

import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.data.api.ApiService
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response

class RemoteDataSourceImpl(
    private val apiService: ApiService
) : RemoteDataSource {
    override fun getIssues(): Observable<Response<ResponseBody>> {
        return apiService.getIssues()
    }

    override fun getComments(id: String): Observable<Response<ResponseBody>> {
        return apiService.getComments(id)
    }
}