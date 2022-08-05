package com.example.turtleminttask.presentation.comments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.turtlemStringtask.data.api.model.CommentsResponse
import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.databinding.ActivityCommentsBinding
import com.example.turtleminttask.databinding.ActivityMainBinding
import com.example.turtleminttask.presentation.issues.IssuesAdapter
import com.example.turtleminttask.presentation.issues.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CommentsActivity : AppCompatActivity() {
    private val viewModel: CommentsViewModel by viewModels()
    private lateinit var adapter: CommentsAdapter
    private var commentsData = ArrayList<CommentsResponse.CommentsResponseItem>()
    private lateinit var binding: ActivityCommentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeViews()
        subScribeForIssuesResponse()
        checkIntentData()
    }

    private fun initializeViews() {
        adapter = CommentsAdapter(commentsData)
        binding.rvComments.layoutManager = LinearLayoutManager(this)
        binding.rvComments.adapter = adapter
    }

    private fun subScribeForIssuesResponse() {
        viewModel.routeCommentsResponse.observe(this, Observer {
            commentsData.clear()
            commentsData.addAll(it)
            adapter.notifyDataSetChanged()
        })
    }

    private fun checkIntentData() {
        val id = intent.getStringExtra(MainActivity.ISSUE_ID)
        val title = intent.getStringExtra(MainActivity.ISSUE_TITLE)
        binding.tvTitle.text = String.format("Title : %s", title)
        if (id != null) {
            viewModel.getComments(id)
        }
    }
}