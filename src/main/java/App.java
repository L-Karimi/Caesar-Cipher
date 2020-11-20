import models.Decrypt;
import models.Encrypt;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean runCaesar = true; while (runCaesar) {

            System.out.println("Welcome to my Caesar Cipher");
            System.out.println("============================");
            System.out.println("Enter encrypt to encrypt or decrypt to decrypt or exit to leave the app");
            String choice = myScanner.nextLine();

}
