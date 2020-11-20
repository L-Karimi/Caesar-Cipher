package models;

public class Encrypt {

    private String mImputString;
    private int mShift;

    public Encrypt(String mImputString, int mShift) {
        this.mImputString = mImputString;
        this.mShift = mShift;
    }

    public String getmImputString() {
        return mImputString;
    }

    public int getmShift() {
        return mShift;
    }
}


