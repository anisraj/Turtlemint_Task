package com.example.turtleminttask.domain.usecase

import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.data.repository.RemoteRepository
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(private val remoteRepository: RemoteRepository) {
    fun execute(id: String): Observable<Response<ResponseBody>> {
        return remoteRepository.getComments(id)
    }
}