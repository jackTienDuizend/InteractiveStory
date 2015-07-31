package com.example.jack.interactivestory.model;

/**
 * Created by jack on 25-7-2015.
 */
public class Page {

    private int mImageId;
    private String mText;

    //Twee keuzes per pagina
    private Choice mChoice1;
    private Choice mChoice2;

    private boolean mIsFinal = false;
    //Constructor voor pagina's met een verwijzing
    public Page(int imageId, String text, Choice choice1, Choice choice2){

        mImageId = imageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    //Constructor voor pagina's zonder verwijzing
    public Page(int imageId, String text) {

        mImageId = imageId;
        mText = text;
        mChoice1 = null; //Variabele is gedefinieerd dus waarde toekennen
        mChoice2 = null; //Variabele is gedefinieerd dus waarde toekennen
        mIsFinal = true;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice mchoice1) {
        this.mChoice1 = mchoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice mchoice2) {
        this.mChoice2 = mchoice2;
    }
}
