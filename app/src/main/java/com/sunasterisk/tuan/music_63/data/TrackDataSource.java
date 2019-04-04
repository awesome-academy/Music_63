package com.sunasterisk.tuan.music_63.data;

import com.sunasterisk.tuan.music_63.data.model.Track;

import java.util.List;

public interface TrackDataSource {
    interface DataCallback<T> {
        void onSuccess(List<T> data);

        void onFailure(String message);
    }
    interface Local{
        void getLocalTracks(DataCallback<Track> callback);

        void searchLocalTracks(String keyword, DataCallback<Track> callback);

        void getFavoriteTracks(DataCallback<Track> callback);

        void addFavoriteTrack(Track track, DataCallback<String> callback);

        void deleteFavoriteTrack(Track track, DataCallback<Boolean> callback);

    }

    interface Remote extends TrackDataSource {
        void getTracks(String api, DataCallback<Track> callback);

        void searchTracks(String api, DataCallback<Track> callback);

        void getDetailTrack(String api, DataCallback<Track> callback);
    }

}
