package tp_Aula3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class OrdenateFile {
    void OrdenateBinFile(int Numero) throws IOException {
        int i, j, A1, A2, tmp;
        RandomAccessFile fpio = new RandomAccessFile("BinFile.dat","rw");
        for(i=0;i<Numero-1;i++){
            for(j=0;j<Numero-1-i;j++){
                A1=fpio.readInt();
                fpio.seek(j*4);
                A2=fpio.readInt();
                if(A1>A2){
                    fpio.seek(j*4);
                    fpio.writeInt(A2);
                    fpio.writeInt(A1);
                }
            }
        }
        fpio.close();
    }

    public static void main(String[] args) {
        int number = 8;
        OrdenateFile order = new OrdenateFile();
        try {
            order.OrdenateBinFile(number);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        };
    }

}
