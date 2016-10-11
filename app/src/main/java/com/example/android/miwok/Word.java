package com.example.android.miwok;

/**
 * Created by dnj on 9/23/16.
 */

public class Word {


    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mSongResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int image, int songResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = image;
        mSongResourceID = songResourceID;

    }



    public Word(String defaultTranslation, String miwokTranslation, int songResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSongResourceID = songResourceID;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImage() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudio(){ return mSongResourceID;}


}
