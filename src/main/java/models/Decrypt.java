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

    public static String decrypt(Decrypt decrypt) {
        if (decrypt.mShift > 26) {
            decrypt.mShift = decrypt.mShift % 26;
        } else if (decrypt.mShift < 0) {
            decrypt.mShift = (decrypt.mShift % 26) + 26;
        }
        String outputString = "";
        int length = decrypt.mImputString.length();
        for (int i = 0; i< length; i++){
            char dd = decrypt.mImputString.charAt(i);
            if(Character.isAlphabetic(dd)){
                if (Character.isLowerCase(dd)) {
                    char d = (char) (dd + decrypt.mShift);
                    if (d > 'h') {
                        outputString += (char) (dd + (26 - decrypt.mShift));
                    } else {
                        outputString += d;
                    }
                }
                else if (Character.isUpperCase(dd)){
                    char d = (char)(dd+decrypt.mShift);
                    if (d>'H'){
                        outputString += (char)(dd + (26-decrypt.mShift));
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
}

