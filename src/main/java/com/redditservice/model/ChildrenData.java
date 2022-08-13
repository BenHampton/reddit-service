package com.redditservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChildrenData {

    @JsonProperty("approved_at_utc")
    private String approvedAtUtc;

    private String subreddit;

    private String selftext;

    @JsonProperty("author_fullname")
    private String authorFullName;

    private boolean saved;

    @JsonProperty("mod_reason_title")
    private String modReasonTitle;

    private boolean clicked;

    private String title;

    @JsonProperty("link_flair_richtext")
    private String linkFlairRichtext [];

    @JsonProperty("subreddit_name_prefixed")
    private String subredditNamePrefixed;

    private boolean hidden;

    private String pwls;

    private Long downs;

    private String name;

    private boolean quarantine;

    @JsonProperty("upvote_ratio")
    private Integer upvoteRatio;

    @JsonProperty("subreddit_type")
    private String subredditType;

    private Long ups;

    @JsonProperty("total_awards_received")
    private Integer totalAwardsReceived;

//    private String media_embed {};

    @JsonProperty("author_flair_template_id")
    private String authorFlairTemplateId;

    @JsonProperty("is_original_content")
    private boolean isOriginalContent;

    @JsonProperty("user_reports")
    private String userReports [];

    @JsonProperty("secure_media")
    private String secureMedia;

    @JsonProperty("is_reddit_media_domain")
    private boolean isRedditMediaDomain;

    @JsonProperty("is_meta")
    private boolean isMeta;

    private String category;

//    private String secure_media_embed {};

    @JsonProperty("link_flair_text")
    private String linkFlairText;

    @JsonProperty("can_mod_post")
    private boolean canModPost;

    private Long score;

    @JsonProperty("approved_by")
    private String approvedBy;

    private String thumbnail;

    private boolean edited;

    @JsonProperty("content_categories")
    private String contentCategories;

    @JsonProperty("is_self")
    private boolean isSelf;

    private Double created;

    private String wls;

    private String domain;

    private String likes;

    private String view_count;

    private boolean archived;

    @JsonProperty("is_crosspostable")
    private boolean isCrosspostable;

    private boolean pinned;

    @JsonProperty("over_18")
    private boolean over18;

    @JsonProperty("all_awardings")
    private String allAwardings [];

    private String awarders [];

    @JsonProperty("media_only")
    private boolean media_only;

    private boolean spoiler;

    private boolean locked;

    @JsonProperty("subreddit_id")
    private String subredditId;

    private String id ;

    @JsonProperty("is_robot_indexable")
    private boolean isRobotIndexable;

    private String author;

    @JsonProperty("discussion_type")
    private String discussionType;

    @JsonProperty("num_comments")
    private Long numComments;

    @JsonProperty("send_replies")
    private boolean sendReplies;

    @JsonProperty("contest_mode")
    private boolean contestMode;

    @JsonProperty("mod_reports")
    private String modReports [];

    private String permalink;

    private String url;

    @JsonProperty("subreddit_subscribers")
    private Long subredditSubscribers;

    @JsonProperty("")
    private Double createdUtc;

    @JsonProperty("is_video")
    private boolean isVideo;
}
