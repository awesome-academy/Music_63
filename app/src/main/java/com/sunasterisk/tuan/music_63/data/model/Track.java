package com.sunasterisk.tuan.music_63.data.model;

public class Track {
    private int mId;
    private int mDuration;
    private String mTitle;
    private String mArtist;
    private String mStreamUrl;
    private String mDownloadUrl;
    private String mArtworkUrl;
    private boolean mIsDownloadable;
    private boolean mIsOffline;
    private String mGenre;
    private String mCreatedAt;
    private int mCommentCount;
    private int mLikesCount;
    private int mPlaybackCount;

    public Track(int id, int duration, String title, String artist
            , String streamUrl, String downloadUrl, String artworkUrl
            , boolean isDownloadable) {
        mId = id;
        mDuration = duration;
        mTitle = title;
        mArtist = artist;
        mStreamUrl = streamUrl;
        mDownloadUrl = downloadUrl;
        mArtworkUrl = artworkUrl;
        mIsDownloadable = isDownloadable;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmDuration() {
        return mDuration;
    }

    public void setmDuration(int mDuration) {
        this.mDuration = mDuration;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getmStreamUrl() {
        return mStreamUrl;
    }

    public void setmStreamUrl(String mStreamUrl) {
        this.mStreamUrl = mStreamUrl;
    }

    public String getmDownloadUrl() {
        return mDownloadUrl;
    }

    public void setmDownloadUrl(String mDownloadUrl) {
        this.mDownloadUrl = mDownloadUrl;
    }

    public String getmArtworkUrl() {
        return mArtworkUrl;
    }

    public void setmArtworkUrl(String mArtworkUrl) {
        this.mArtworkUrl = mArtworkUrl;
    }

    public boolean ismIsDownloadable() {
        return mIsDownloadable;
    }

    public void setmIsDownloadable(boolean mIsDownloadable) {
        this.mIsDownloadable = mIsDownloadable;
    }

    public boolean ismIsOffline() {
        return mIsOffline;
    }

    public void setmIsOffline(boolean mIsOffline) {
        this.mIsOffline = mIsOffline;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmCreatedAt() {
        return mCreatedAt;
    }

    public void setmCreatedAt(String mCreatedAt) {
        this.mCreatedAt = mCreatedAt;
    }

    public int getmCommentCount() {
        return mCommentCount;
    }

    public void setmCommentCount(int mCommentCount) {
        this.mCommentCount = mCommentCount;
    }

    public int getmLikesCount() {
        return mLikesCount;
    }

    public void setmLikesCount(int mLikesCount) {
        this.mLikesCount = mLikesCount;
    }

    public int getmPlaybackCount() {
        return mPlaybackCount;
    }

    public void setmPlaybackCount(int mPlaybackCount) {
        this.mPlaybackCount = mPlaybackCount;
    }
}
