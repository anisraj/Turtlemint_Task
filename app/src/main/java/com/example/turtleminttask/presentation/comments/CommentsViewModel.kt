package com.example.turtleminttask.presentation.comments

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.turtlemStringtask.data.api.model.CommentsResponse
import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.domain.usecase.GetCommentsUseCase
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class CommentsViewModel @Inject constructor(
    private val getCommentsUseCase: GetCommentsUseCase
) : ViewModel() {
    private val TAG = "CommentsViewModel"
    private var commentsResponse = MutableLiveData<CommentsResponse>()
    val routeCommentsResponse: LiveData<CommentsResponse> = commentsResponse

    fun getComments(id: String) {
        getCommentsUseCase.execute(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Response<ResponseBody>> {
                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(t: Response<ResponseBody>) {
                    val body = t.body()!!.string()
                    val response = Gson().fromJson(body, CommentsResponse::class.java)
                    commentsResponse.value = response

                }

                override fun onError(e: Throwable) {
                    Log.d(TAG, "onError: "+e.message)
                }

                override fun onComplete() {
                }

            })
    }
}