package com.example.android.miwok;

/**
 * Created by zhakonze on 2018/09/21.
 */

public class Word {
    private String mMiwok;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String Miwok, String Translation)
    {
        mMiwok = Miwok;
        mDefaultTranslation = Translation;
    }

    public Word(String Miwok, String Translation, int ImgRes)
    {
        mMiwok = Miwok;
        mDefaultTranslation = Translation;
        mImageResourceId = ImgRes;
    }

    public String getmMiwok() {
        return mMiwok;
    }

    public void setmMiwok(String mMiwok) {
        this.mMiwok = mMiwok;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}
