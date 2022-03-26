package tp_Aula4;

import java.util.Scanner;

public class DemoCreateBinFile {
    public static void main(String[] args) {
        //Scanner keyboard = new Scanner(System.in);

        //int fileLength = keyboard.nextInt();

        System.out.println("CREATING FILE WITH 10 NUMBERS");
        CreateBinFile.createRandomFile(10, "messyFile10.bin");
        System.out.println("...");
        System.out.println("\nCREATING FILE WITH 100 NUMBERS");
        CreateBinFile.createRandomFile(100, "messyFile100.bin");
        System.out.println("...");
        System.out.println("\nCREATING FILE WITH 1000 NUMBERS");
        CreateBinFile.createRandomFile(1000, "messyFile1000.bin");
        System.out.println("...");
        System.out.println("\nCREATING FILE WITH 10000 NUMBERS");
        CreateBinFile.createRandomFile(10000, "messyFile10000.bin");
        System.out.println("...");
        System.out.println("\nCREATING FILE WITH 100000 NUMBERS");
        CreateBinFile.createRandomFile(100000, "messyFile100000.bin");
        System.out.println("...");
        System.out.println("\nCREATING FILE WITH 1000000 NUMBERS");
        CreateBinFile.createRandomFile(1000000, "messyFile1000000.bin");
        System.out.println("...");

    }

}
