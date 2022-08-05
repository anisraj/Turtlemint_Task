package com.example.turtleminttask.presentation.issues

import com.example.turtlemStringtask.data.api.model.IssuesResponse

interface IssuesClickListener {
    fun onIssuesClick(data: IssuesResponse.IssuesResponseItem)
}