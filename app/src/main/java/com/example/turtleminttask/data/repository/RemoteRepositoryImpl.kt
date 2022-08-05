package com.example.turtleminttask.data.repository

import com.example.turtlemStringtask.data.api.model.IssuesResponse
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : RemoteRepository {
    override fun getIssues(): Observable<Response<ResponseBody>> {
        return remoteDataSource.getIssues()
    }

    override fun getComments(id: String): Observable<Response<ResponseBody>> {
        return remoteDataSource.getComments(id)
    }
}