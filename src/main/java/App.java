import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean runCaesar = true; {

            System.out.println("Welcome to my Caesar Cipher");
            System.out.println("============================");
            System.out.println("Enter encrypt to encrypt or decrypt to decrypt or exit to leave the app");
            String choice = myScanner.nextLine();

            if (choice.equals("encrypt")) {
                System.out.println("models.Encrypt your message by entering it in the next line");
                String input = myScanner.nextLine();
                System.out.println("============================");

                System.out.println("Enter a key");
                int key = myScanner.nextInt();
                System.out.println("============================");
                Encrypt caesar = new Encrypt(input, key);
                String encrypted = Encrypt.encrypt(caesar);
                System.out.println("Encrypted message: " + encrypted);
                System.out.println("============================");
                System.out.println("============================");
                System.out.println("============================");


}
