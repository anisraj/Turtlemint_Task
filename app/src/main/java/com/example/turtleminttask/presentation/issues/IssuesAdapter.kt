package com.example.turtleminttask.presentation.issues

import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.turtlemStringtask.data.api.model.IssuesResponse
import com.example.turtleminttask.databinding.LayoutIssuesItemBinding

class IssuesAdapter(
    private val issuesData: ArrayList<IssuesResponse.IssuesResponseItem>,
    private val issuesClickListener: IssuesClickListener
) : RecyclerView.Adapter<IssuesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutIssuesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(issuesData[position])
        holder.itemBinding.root.setOnClickListener {
            issuesClickListener.onIssuesClick(issuesData[position])
        }
    }

    override fun getItemCount() = issuesData.size

    class ViewHolder(val itemBinding: LayoutIssuesItemBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun bindData(data: IssuesResponse.IssuesResponseItem) {
            Glide.with(itemBinding.ivAvatar.context)
                .load(data.user?.avatarUrl)
                .into(itemBinding.ivAvatar)
            itemBinding.tvUserName.text = String.format("%s : %s", "User Name", data.user?.login)
            itemBinding.tvUpdatedAt.text = String.format("%s : %s", "Updated At", data.updatedAt)
            if (!data.title.isNullOrEmpty()) {
                itemBinding.tvDesc.text = String.format("%s : %s", "Description", data.title)
            } else {
                itemBinding.tvDesc.text = "No Description"
            }
        }
    }
}