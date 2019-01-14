package com.example.den.lesson5.DataSources.Giphy;

import android.media.Image;

import com.example.den.lesson5.Interfaces.PhotoItem;

import java.util.Map;

public class PhotoItemGiphy implements PhotoItem {

//    Map<String,String> downsized_medium;
//    User user;
//
//
//    public String getImgUrl() {
//        return this.downsized_medium.get("url");
//    }
//
//    public String getAuthorName() {
//        return this.user.display_name;
//    }
//
//    public class User {
//        String display_name;
//    }

    Image images;
    User user;


    public String getImgUrl() {
        return this.images.downsized_medium.url;
    }

    public String getAuthorName() {
        return this.user.display_name;
    }

    public class User {
        String display_name;
    }

    public class Image {
        DownsizedMedium downsized_medium;
    }

    public class DownsizedMedium {
        String url;
    }
}
