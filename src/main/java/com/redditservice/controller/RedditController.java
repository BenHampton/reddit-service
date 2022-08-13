package com.redditservice.controller;

import com.redditservice.model.Reddit;
import com.redditservice.service.RedditService;
import org.apache.catalina.loader.ResourceEntry;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reddit")
public class RedditController {

    private final RedditService redditService;

    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping()
    public ResponseEntity<Reddit> findReddit(@RequestParam String category,
                                             @RequestParam String time,
                                             @RequestParam String limit) {
        return ResponseEntity.ok(redditService.findReddit(category, time, limit));
    }
}
