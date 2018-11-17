package com.example.android.miwok;

/**
 * Created by zhakonze on 2018/09/21.
 */

public class Word {
    private String mMiwok;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String Miwok, String Translation, int AudioResourceId)
    {
        mMiwok = Miwok;
        mDefaultTranslation = Translation;
        mAudioResourceId = AudioResourceId;
    }

    public Word(String Miwok, String Translation, int ImgRes, int AudioResourceId)
    {
        mMiwok = Miwok;
        mDefaultTranslation = Translation;
        mImageResourceId = ImgRes;
        mAudioResourceId = AudioResourceId;
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
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}
