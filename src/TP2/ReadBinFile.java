package TP2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadBinFile {

    private static final String DIRECTORY = "C:\\Users\\marcramos\\Desktop\\algoritmiaestruturasdados\\src\\TP2\\";

    public static String readBinFile (String fileName){

        try {
            File orderfile = new File(DIRECTORY + "dadosBIN\\" + fileName);
            FileInputStream fpin = new FileInputStream (DIRECTORY + "dadosBIN\\" + fileName);
            DataInputStream in = new DataInputStream (fpin);

            int tamanho = (int) orderfile.length();

            System.out.println("\nREADING FILE...\n");
            StringBuilder str = new StringBuilder();

            for(int i=0; i < tamanho/2; i++){
                char letter = in.readChar();
                str.append(letter);
            }
            return String.valueOf(str);
        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
        return "Nao foi possivel retornar dados!";
    }




}

