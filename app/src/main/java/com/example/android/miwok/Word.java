package com.example.android.miwok;

/**
 * Created by maho on 2017/02/19.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */

public class Word {

    /** default translation for the word */
    private String mDefaultTranslation;

    /** miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    public Word(String defaultTranslation, String miwokTranslation, int mImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    /**
     * get the default translation of the words
     * @return
     */
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    /**
     *  get the miwok translation of the words
     * @return
     */
    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
