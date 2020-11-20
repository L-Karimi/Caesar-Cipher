package models;

public class Decrypt {
    private String mImputString;
    private int mShift;

    public Decrypt(String mImputString, int mShift) {
        this.mImputString = mImputString;
        this.mShift = mShift;
    }

    public String getmImputString() {
        return mImputString;
    }

    public int getmShift() {
        return mShift;
    }
    public  static  String decrypt(Decrypt decrypt)
}
