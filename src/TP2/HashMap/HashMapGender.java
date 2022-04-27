package TP2.HashMap;

import java.io.*;
import java.util.HashMap;

import static TP2.GlobalVariables.DIRECTORY;

public class HashMapGender {

    public static HashMap<String, Character> readFileGenderTable (String fileName){
        String fileDirNameTxt = DIRECTORY + "dadosTXT\\dadosOriginais\\" + fileName;

        HashMap<String, Character> myGenderHashMap = new HashMap<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileDirNameTxt));

            System.out.println("\nREADING GENDER FILE...\n");
            String line = "";
            while ((line = in.readLine()) != null) {
                String[] temp = line.split(" ");

                String name = temp[0];
                Character gender = temp[1].charAt(0);;

                //System.out.println(name + gender);
                myGenderHashMap.put(name, gender);
            }
        }catch(EOFException e){
            System.out.println("End of file!\n");

        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
        return myGenderHashMap;
    }

    public static void updateFileGenderTable(String fileName, String name, Character gender){
        String fileDirNameTxt = DIRECTORY + "dadosTXT\\dadosOriginais\\" + fileName;
        try{
            FileWriter fw = new FileWriter(fileDirNameTxt, true);
            String lineToAppend = "\n" + name + " " + gender;
            fw.write(lineToAppend);
            fw.close();

        }catch (IOException e){
            System.out.println("algo errado!");
        }
    }
}
