package com.example.turtleminttask.presentation.issues

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.domain.usecase.GetIssuesUseCase
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
class MainViewModel @Inject constructor(
    private val getIssuesUseCase: GetIssuesUseCase
) : ViewModel() {
    private val TAG = "MainViewModel"
    private var issuesResponse = MutableLiveData<IssuesResponse>()
    val routeIssuesResponse: LiveData<IssuesResponse> = issuesResponse

    fun getIssues() {
        getIssuesUseCase.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Response<ResponseBody>> {
                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(t: Response<ResponseBody>) {
                    val body = t.body()!!.string()
                    val response = Gson().fromJson(body, IssuesResponse::class.java)
                    issuesResponse.value = response

                }

                override fun onError(e: Throwable) {
                    Log.d(TAG, "onError: "+e.message)
                }

                override fun onComplete() {
                }

            })
    }
}