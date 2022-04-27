package TP2.FileClasses;

import TP2.GlobalVariables;

import java.io.*;

public class CreateBinFileData implements GlobalVariables {

    private static final String DIRECTORY =  GlobalVariables.DIRECTORY;

    public static void createBinFile(String fileName) {
        String fileDirNameTxt = DIRECTORY + "dadosTXT\\dadosOriginais\\" + fileName;
        System.out.println(fileDirNameTxt);

        String fileDirNameBin = DIRECTORY + "dadosBIN\\Dados.dat";
        System.out.println(fileDirNameBin);

        try {
            FileOutputStream fpout = new FileOutputStream(fileDirNameBin);
            DataOutputStream out = new DataOutputStream(fpout);

            BufferedReader in = new BufferedReader(new FileReader(fileDirNameTxt));

            String str = "";
            while ((str = in.readLine()) != null) {
                System.out.println(str);

                byte tamanhoNome = (byte) str.length();
                out.writeByte(tamanhoNome);
                out.writeBytes(str);

                String data = in.readLine();
                String [] temp = data.split("/");

                byte dia = (byte) Integer.parseInt(temp[0]);
                System.out.println(dia);
                out.writeByte(dia);

                byte mes = (byte) Integer.parseInt(temp[1]);
                System.out.println(mes);
                out.writeByte(mes);

                int ano = Integer.parseInt(temp[2]);
                System.out.println(ano);
                out.writeInt(ano);

                int telefone = Integer.parseInt(in.readLine());
                System.out.println(telefone);
                out.writeInt(telefone);
            }
            in.close();
            out.close();
            System.out.println("Ficheiro binario criado com base no ficheiro de texto: " + fileName);

        } catch (IOException e) {
            System.out.println("Problems in open, read or write. \n");
        }
    }
}

