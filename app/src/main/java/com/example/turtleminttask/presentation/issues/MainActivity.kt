package com.example.turtleminttask.presentation.issues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.R
import com.example.turtleminttask.databinding.ActivityMainBinding
import com.example.turtleminttask.presentation.comments.CommentsActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), IssuesClickListener {
    companion object {
        const val ISSUE_ID = "issue_id"
        const val ISSUE_TITLE = "issue_title"
    }
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: IssuesAdapter
    private var issuesData = ArrayList<IssuesResponse.IssuesResponseItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeViews()
        subScribeForIssuesResponse()
    }

    private fun initializeViews() {
        adapter = IssuesAdapter(issuesData, this)
        binding.rvIssues.layoutManager = LinearLayoutManager(this)
        binding.rvIssues.adapter = adapter
    }

    private fun subScribeForIssuesResponse() {
        viewModel.routeIssuesResponse.observe(this, Observer {
            issuesData.clear()
            issuesData.addAll(it)
            adapter.notifyDataSetChanged()
        })
        viewModel.getIssues()
    }

    override fun onIssuesClick(data: IssuesResponse.IssuesResponseItem) {
        val intent = Intent(this, CommentsActivity::class.java)
        intent.putExtra(ISSUE_ID, data.number)
        intent.putExtra(ISSUE_TITLE, data.title)
        startActivity(intent)
    }
}