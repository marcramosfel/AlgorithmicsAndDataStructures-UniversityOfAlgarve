package tp_Aula4;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinFile {
    private final String DIRECTORY = "C:\\Users\\marcramos\\Desktop\\algoritmiaestruturasdados\\src\\tp_Aula4\\messyFiles\\";

    private int[] arrayInt;

    public ReadBinFile(String fileName) {
        try {
            File orderfile = new File(this.DIRECTORY + fileName);

            FileInputStream fpin = new FileInputStream (this.DIRECTORY + fileName);
            DataInputStream in = new DataInputStream (fpin);

            long tamanho = orderfile.length()/4;
            this.arrayInt = new int[(int) tamanho];

            System.out.println("READING FILE...");

            for(int i=0; i < tamanho; i++){
                int a = in.readInt();
                this.arrayInt[i] = a;
                //System.out.print("|"+a+"|");
            }
            in.close();
        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
    }

    public int[] getArrayInt() {
        return this.arrayInt;
    }
}
