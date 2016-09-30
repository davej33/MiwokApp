package com.example.android.miwok;

/**
 * Created by dnj on 9/23/16.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImage;

    public Word(String defaultTranslation, String miwokTranslation, int image){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){ return mMiwokTranslation; }

    public int getImage() { return mImage; }

}
