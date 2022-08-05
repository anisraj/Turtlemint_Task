package com.example.turtlemStringtask.data.api.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class IssuesResponse : ArrayList<IssuesResponse.IssuesResponseItem>(){
    data class IssuesResponseItem(
        @SerializedName("url")
        @Expose
        var url: String? = null,
        @SerializedName("repository_url")
        @Expose
        var repositoryUrl: String? = null,
        @SerializedName("labels_url")
        @Expose
        var labelsUrl: String? = null,
        @SerializedName("comments_url")
        @Expose
        var commentsUrl: String? = null,
        @SerializedName("events_url")
        @Expose
        var eventsUrl: String? = null,
        @SerializedName("html_url")
        @Expose
        var htmlUrl: String? = null,
        @SerializedName("id")
        @Expose
        var id: String? = null,
        @SerializedName("node_id")
        @Expose
        var nodeId: String? = null,
        @SerializedName("number")
        @Expose
        var number: String? = null,
        @SerializedName("title")
        @Expose
        var title: String? = null,
        @SerializedName("user")
        @Expose
        var user: User? = null,
        @SerializedName("labels")
        @Expose
        var labels: List<Label?>? = null,
        @SerializedName("state")
        @Expose
        var state: String? = null,
        @SerializedName("locked")
        @Expose
        var locked: Boolean? = null,
        @SerializedName("assignee")
        @Expose
        var assignee: Assignee? = null,
        @SerializedName("assignees")
        @Expose
        var assignees: List<Assignee?>? = null,
        @SerializedName("milestone")
        @Expose
        var milestone: Milestone? = null,
        @SerializedName("comments")
        @Expose
        var comments: String? = null,
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null,
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null,
        @SerializedName("closed_at")
        @Expose
        var closedAt: Any? = null,
        @SerializedName("author_association")
        @Expose
        var authorAssociation: String? = null,
        @SerializedName("active_lock_reason")
        @Expose
        var activeLockReason: Any? = null,
        @SerializedName("draft")
        @Expose
        var draft: Boolean? = null,
        @SerializedName("pull_request")
        @Expose
        var pullRequest: PullRequest? = null,
        @SerializedName("body")
        @Expose
        var body: String? = null,
        @SerializedName("timeline_url")
        @Expose
        var timelineUrl: String? = null,
        @SerializedName("performed_via_github_app")
        @Expose
        var performedViaGithubApp: Any? = null,
        @SerializedName("state_reason")
        @Expose
        var stateReason: String? = null
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
    
        data class Label(
            @SerializedName("id")
            @Expose
            var id: Long? = null,
            @SerializedName("node_id")
            @Expose
            var nodeId: String? = null,
            @SerializedName("url")
            @Expose
            var url: String? = null,
            @SerializedName("name")
            @Expose
            var name: String? = null,
            @SerializedName("color")
            @Expose
            var color: String? = null,
            @SerializedName("default")
            @Expose
            var default: Boolean? = null,
            @SerializedName("description")
            @Expose
            var description: String? = null
        )
    
        data class Assignee(
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
    
        data class Milestone(
            @SerializedName("url")
            @Expose
            var url: String? = null,
            @SerializedName("html_url")
            @Expose
            var htmlUrl: String? = null,
            @SerializedName("labels_url")
            @Expose
            var labelsUrl: String? = null,
            @SerializedName("id")
            @Expose
            var id: String? = null,
            @SerializedName("node_id")
            @Expose
            var nodeId: String? = null,
            @SerializedName("number")
            @Expose
            var number: String? = null,
            @SerializedName("title")
            @Expose
            var title: String? = null,
            @SerializedName("description")
            @Expose
            var description: String? = null,
            @SerializedName("creator")
            @Expose
            var creator: Creator? = null,
            @SerializedName("open_issues")
            @Expose
            var openIssues: String? = null,
            @SerializedName("closed_issues")
            @Expose
            var closedIssues: String? = null,
            @SerializedName("state")
            @Expose
            var state: String? = null,
            @SerializedName("created_at")
            @Expose
            var createdAt: String? = null,
            @SerializedName("updated_at")
            @Expose
            var updatedAt: String? = null,
            @SerializedName("due_on")
            @Expose
            var dueOn: String? = null,
            @SerializedName("closed_at")
            @Expose
            var closedAt: Any? = null
        ) {
            data class Creator(
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
        }
    
        data class PullRequest(
            @SerializedName("url")
            @Expose
            var url: String? = null,
            @SerializedName("html_url")
            @Expose
            var htmlUrl: String? = null,
            @SerializedName("diff_url")
            @Expose
            var diffUrl: String? = null,
            @SerializedName("patch_url")
            @Expose
            var patchUrl: String? = null,
            @SerializedName("merged_at")
            @Expose
            var mergedAt: Any? = null
        )
    }
}