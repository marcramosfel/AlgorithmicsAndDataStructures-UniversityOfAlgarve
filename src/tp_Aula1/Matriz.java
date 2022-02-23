package tp_Aula1;

import java.io.*;
import java.lang.reflect.Array;

public class Matriz {
    public int num_linhas;
    public int num_colunas;
    public int [][] mat;

    public Matriz(String nome_ficheiro) {
        System.out.println("Inside Ctor CMatriz " + nome_ficheiro);
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(nome_ficheiro));
            String l = inputStream.readLine();
            String [] tmp = l.split(" ");

            num_linhas = Integer.parseInt(tmp[0]);
            num_colunas  = Integer.parseInt(tmp[1]);
            System.out.println(num_linhas + num_colunas);
            mat = new int[num_linhas][num_colunas];

            for (int i = 0; i < num_linhas; i++){
                l = inputStream.readLine();
                tmp = l.split(" ");
                for(int j = 0; j<tmp.length; j++){
                   mat[i][j] = Integer.parseInt(tmp[j]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Matriz m = new Matriz("");
    }
}
