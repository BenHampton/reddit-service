package com.redditservice.client;

import com.redditservice.model.Reddit;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;

@Component
public class RedditClient {

    private final RestTemplate restTemplate;

    private final String BASE_URL = "https://api.reddit.com";

    public RedditClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Reddit findReddit(String category, String time, String limit) {
        String categoryParam = "/" + category;
        String timeParam = "t=" + time;
        String limitParam = "limit=" + limit;
        String url = BASE_URL + "/r" + categoryParam +"?" + timeParam + "&" + limitParam;

        URI uriBuilder = URI.create(url);
        HttpEntity headers = buildHeaders();

        ResponseEntity<Reddit> response = restTemplate.exchange(uriBuilder.toString(), HttpMethod.GET, headers, Reddit.class);
        return response.getBody();
    }

    private HttpEntity buildHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("User-agent", "user-agent");
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        return  entity;
    }
}
