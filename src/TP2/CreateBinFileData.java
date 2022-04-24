package TP2;

import java.io.*;
import java.util.Scanner;

public class CreateBinFileData {

    private static final String DIRECTORY = "C:\\Users\\marcramos\\Desktop\\algoritmiaestruturasdados\\src\\TP2\\";

    public static void createBinFile(String fileName) {
        String fileDirNameTxt = DIRECTORY + "dadosTXT\\" + fileName;
        System.out.println(fileDirNameTxt);

        String fileDirNameBin = DIRECTORY + "dadosBIN\\Dados.bin";
        System.out.println(fileDirNameBin);

        try {
            FileOutputStream fpout = new FileOutputStream(fileDirNameBin);
            DataOutputStream out = new DataOutputStream(fpout);

            Scanner in = new Scanner(new FileReader(fileDirNameTxt));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.writeChars(line + '\n');

            }
            in.close();
            out.close();
            System.out.println("Ficheiro binario criado com base no ficheiro de texto: " + fileName);

        } catch (IOException e) {
            System.out.println("Problems in open, read or write. \n");
        }
    }
}

