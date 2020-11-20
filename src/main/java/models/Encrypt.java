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

    public static String encypt(Encrypt encrypt) {
        if (encypt.mShift > 26) {
            encypt.mShift = encypt.mShift % 26;
        } else if (encrypt.mShift < 0) {
            encrypt.mShift = (encrypt.mShift % 26) + 26;
        }

    }
}




