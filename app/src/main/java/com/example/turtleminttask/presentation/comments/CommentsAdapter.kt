package com.example.turtleminttask.presentation.comments

import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.turtlemStringtask.data.api.model.CommentsResponse
import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.databinding.LayoutCommentsItemBinding
import com.example.turtleminttask.databinding.LayoutIssuesItemBinding

class CommentsAdapter(
    private val commentsResponse: ArrayList<CommentsResponse.CommentsResponseItem>
) : RecyclerView.Adapter<CommentsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutCommentsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(commentsResponse[position])
    }

    override fun getItemCount() = commentsResponse.size

    class ViewHolder(val itemBinding: LayoutCommentsItemBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun bindData(data: CommentsResponse.CommentsResponseItem) {
            itemBinding.tvUserName.text = String.format("User : %s", data.user?.login)
            itemBinding.tvComment.text = String.format("Comment : %s",data.body)
        }
    }
}