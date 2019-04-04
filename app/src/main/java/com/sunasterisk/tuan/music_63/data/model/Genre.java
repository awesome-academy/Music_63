package com.sunasterisk.tuan.music_63.data.model;

public class Genre {
    private String mName;
    private String mKeyGenre;
    private int mImageId;

    public Genre(String name, String keyGenre, int imageId) {
        mName = name;
        mKeyGenre = keyGenre;
        mImageId = imageId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmKeyGenre() {
        return mKeyGenre;
    }

    public void setmKeyGenre(String mKeyGenre) {
        this.mKeyGenre = mKeyGenre;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }
}
