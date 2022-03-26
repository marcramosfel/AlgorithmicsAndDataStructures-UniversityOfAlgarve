package tp_Aula2;

import java.io.*;

class CMatriz{
    int num_linhas;
    int num_colunas;
    int [][] mat;

    CMatriz(String nome_ficheiro){

        System.out.println("Inside Ctor CMatriz: "+ nome_ficheiro);
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(nome_ficheiro));

            String l;
            l = inputStream.readLine();
            String [] tmp=l.split(" ");
            num_linhas=Integer.parseInt(tmp[0]);
            num_colunas=Integer.parseInt(tmp[1]);
            mat=new int[num_linhas][num_colunas];
            for (int i=0; i< num_linhas;i++){
                l = inputStream.readLine();
                tmp=l.split(" ");
                for(int j=0; j<tmp.length; j++){
                    mat[i][j]=Integer.parseInt(tmp[j]);
                }
            }
        } catch(IOException e){

            System.out.println(e);
        }
    }

    void Mostra(){

        for (int i=0; i< num_linhas;i++){
            for(int j=0; j<num_colunas; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String [] arg){

        CMatriz M=new CMatriz("C:\\Users\\marcramos\\Desktop\\algoritmiaestruturasdados\\src\\tp_Aula2\\mat1.txt");
        M.Mostra();
    }
}
