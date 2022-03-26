package tp_Aula2;

import java.io.*;
import java.util.Arrays;

public class CMatrizTwo {
    private int linha, coluna;
    private int[][] matriz;

    public CMatrizTwo(int linha, int coluna, int[][] matr) {
        this.linha = linha;
        this.coluna = coluna;
        this.matriz = new int[linha][coluna];
        for(int i =0; i<linha; i++){
            System.arraycopy(matr[i], 0, this.matriz[i], 0, coluna);
        }
    }

    public void save(String file) throws IOException {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            String str = "";
            for (int i=0; i< linha;i++){
                if (i!=0) out.write("\n");
                for(int j=0; j<coluna; j++){
                    out.write(matriz[i][j] +" ");
                }
            }
//            out.write(Arrays.deepToString(this.matriz) +"\n");
            out.close();
        } catch (IOException e) {
            System.out.println("Erro de entrada\n");
        }
    }

    public static void main(String[] args) throws IOException {
        CMatriz matriz = new CMatriz("C:\\Users\\marcramos\\Desktop\\algoritmiaestruturasdados\\src\\tp_Aula2\\mat1.txt");
        CMatrizTwo m1 = new CMatrizTwo(2, 3, matriz.mat);
        m1.save("save.txt");

    }
}

