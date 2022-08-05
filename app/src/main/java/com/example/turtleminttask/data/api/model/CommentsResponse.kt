package com.example.turtlemStringtask.data.api.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class CommentsResponse : ArrayList<CommentsResponse.CommentsResponseItem>(){
    data class CommentsResponseItem(
        @SerializedName("url")
        @Expose
        var url: String? = null,
        @SerializedName("html_url")
        @Expose
        var htmlUrl: String? = null,
        @SerializedName("issue_url")
        @Expose
        var issueUrl: String? = null,
        @SerializedName("id")
        @Expose
        var id: String? = null,
        @SerializedName("node_id")
        @Expose
        var nodeId: String? = null,
        @SerializedName("user")
        @Expose
        var user: User? = null,
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null,
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null,
        @SerializedName("author_association")
        @Expose
        var authorAssociation: String? = null,
        @SerializedName("body")
        @Expose
        var body: String? = null,
        @SerializedName("reactions")
        @Expose
        var reactions: Reactions? = null,
        @SerializedName("performed_via_github_app")
        @Expose
        var performedViaGithubApp: Any? = null
    ) {
        data class User(
            @SerializedName("login")
            @Expose
            var login: String? = null,
            @SerializedName("id")
            @Expose
            var id: String? = null,
            @SerializedName("node_id")
            @Expose
            var nodeId: String? = null,
            @SerializedName("avatar_url")
            @Expose
            var avatarUrl: String? = null,
            @SerializedName("gravatar_id")
            @Expose
            var gravatarId: String? = null,
            @SerializedName("url")
            @Expose
            var url: String? = null,
            @SerializedName("html_url")
            @Expose
            var htmlUrl: String? = null,
            @SerializedName("followers_url")
            @Expose
            var followersUrl: String? = null,
            @SerializedName("following_url")
            @Expose
            var followingUrl: String? = null,
            @SerializedName("gists_url")
            @Expose
            var gistsUrl: String? = null,
            @SerializedName("starred_url")
            @Expose
            var starredUrl: String? = null,
            @SerializedName("subscriptions_url")
            @Expose
            var subscriptionsUrl: String? = null,
            @SerializedName("organizations_url")
            @Expose
            var organizationsUrl: String? = null,
            @SerializedName("repos_url")
            @Expose
            var reposUrl: String? = null,
            @SerializedName("events_url")
            @Expose
            var eventsUrl: String? = null,
            @SerializedName("received_events_url")
            @Expose
            var receivedEventsUrl: String? = null,
            @SerializedName("type")
            @Expose
            var type: String? = null,
            @SerializedName("site_admin")
            @Expose
            var siteAdmin: Boolean? = null
        )
    
        data class Reactions(
            @SerializedName("url")
            @Expose
            var url: String? = null,
            @SerializedName("total_count")
            @Expose
            var totalCount: String? = null,
            @SerializedName("laugh")
            @Expose
            var laugh: String? = null,
            @SerializedName("hooray")
            @Expose
            var hooray: String? = null,
            @SerializedName("confused")
            @Expose
            var confused: String? = null,
            @SerializedName("heart")
            @Expose
            var heart: String? = null,
            @SerializedName("rocket")
            @Expose
            var rocket: String? = null,
            @SerializedName("eyes")
            @Expose
            var eyes: String? = null
        )
    }
}