package com.redditservice.service;

import com.redditservice.client.RedditClient;
import com.redditservice.model.Reddit;
import org.springframework.stereotype.Service;

@Service
public class RedditService {

    private RedditClient redditClient;

    public RedditService(RedditClient redditClient) {
        this.redditClient = redditClient;
    }

    public Reddit findReddit(String category, String time, String limit) {
        return redditClient.findReddit(category, time, limit);
    }
}
