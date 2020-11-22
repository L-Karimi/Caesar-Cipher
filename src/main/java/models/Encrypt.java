package models;

public class Encrypt {

    private String mImputString;
    private int mShift;

    public Encrypt(String mImputString, int mShift) {
        this.mImputString = mImputString;
        this.mShift = mShift;
    }

    public String getmInputString() {
        return mImputString;
    }

    public int getmShift() {
        return mShift;
    }

    public static String encrypt(Encrypt encrypt) {
        if (encrypt.mShift > 26) {
            encrypt.mShift = encrypt.mShift % 26;
        } else if (encrypt.mShift < 0) {
            encrypt.mShift = (encrypt.mShift % 26) + 26;
        }
        String outputString = "";
        int length = encrypt.mImputString.length();
        for (int i = 0; i< length; i++) {
            char dd = encrypt.mImputString.charAt(i);
            if (Character.isAlphabetic(dd)) {
                if (Character.isLowerCase(dd)) {
                    char d = (char) (dd + encrypt.mShift);
                    if (d > 'k') {
                        outputString += (char) (dd + (26 - encrypt.mShift));
                    } else {
                        outputString += d;
                    }
                }
                else if (Character.isUpperCase(dd)){
                    char d = (char)(dd+encrypt.mShift);
                    if (d>'K'){
                        outputString += (char)(dd + (26-encrypt.mShift));
                    }
                    else {
                        outputString += d;
                    }
                }
            }
            else {
                outputString += dd;
            }
        }
        return  outputString;
    }



//    public String getmInputString() {
//        return null;
//    }
}







