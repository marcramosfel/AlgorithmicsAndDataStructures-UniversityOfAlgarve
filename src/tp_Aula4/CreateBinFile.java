package tp_Aula4;
import java.io.*;

public class CreateBinFile {
    private static final String DIRECTORY = "C:\\Users\\marcramos\\Desktop\\algoritmiaestruturasdados\\src\\tp_Aula4\\";


    public static int generateTicketNumber(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void createRandomFile(int fileLength, String fileName){
        String fileDirName = CreateBinFile.DIRECTORY + "messyFiles\\" + fileName;

        try {
            FileOutputStream fpout = new FileOutputStream (fileDirName);
            DataOutputStream out = new DataOutputStream (fpout);
            for(int i=0; i < fileLength; i++){
                int a = generateTicketNumber(0, 10000);
                out.writeInt(a);
            }
            out.close();
        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
    }



    public static void createOrderFile(String fileName, int[] orderArray) {
        String fileDirName = CreateBinFile.DIRECTORY + "orderFiles\\" + fileName;

        try {
            FileOutputStream fpout = new FileOutputStream (fileDirName);
            DataOutputStream out = new DataOutputStream (fpout);

            for (int a : orderArray) {
                out.writeInt(a);
            }
            out.close();
        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
    }
}

