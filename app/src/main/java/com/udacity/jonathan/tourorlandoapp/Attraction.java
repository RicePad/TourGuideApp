package com.udacity.jonathan.tourorlandoapp;

public class Attraction {
    private int mAttractionTitle;

    private int mAttractionDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Attraction(int AttractionTitle, int AttractionDescription) {
       mAttractionTitle = AttractionTitle;
       mAttractionDescription = AttractionDescription;
    }

    public Attraction(int AttractionTitle, int AttractionDescription, int imageResourceId) {
        mAttractionTitle = AttractionTitle;
        mAttractionDescription = AttractionDescription;
        mImageResourceId = imageResourceId;
    }

    public int getAttractionTitle() {
        return mAttractionTitle;
    }

    public int getAttractionDescription() {
        return mAttractionDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}