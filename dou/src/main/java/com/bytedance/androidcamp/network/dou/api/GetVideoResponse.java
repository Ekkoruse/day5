package com.bytedance.androidcamp.network.dou.api;

import com.bytedance.androidcamp.network.dou.model.Video;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideoResponse {
    @SerializedName("feeds") public List<Video> video;
    @SerializedName("success") public boolean success;


    public List<Video> getVideo(){return video;}



}
