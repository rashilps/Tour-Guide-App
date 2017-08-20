package com.shah.rashil.tourguide;

/**
 * Created by rashil on 2/8/17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;


    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static  final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }



    public Word(String defaultTranslation, String miwokTranslation, int imageR){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageResourceId= imageR;

    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
