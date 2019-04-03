package com.example.tuan.music_63.data;

import java.util.List;

public interface TrackDataSource {
    interface DataCallback<T>{
        void onSuccess(List<T> data);

        void onFailure(String message);
    }

}
