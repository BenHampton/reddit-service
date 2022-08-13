package com.redditservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RedditData {

    private String after;

    private String dist;

    private String modhash;

    private String before;

    @JsonProperty("geo_filter")
    private String geoFilter;

    @JsonProperty("children")
    List<Children> childrenList = new ArrayList<>();
}
