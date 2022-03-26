package tp_Aula2;

import java.io.*;
public class Copy {
    public static void main(String[] args) throws IOException {
        CMatriz matriz = new CMatriz("mat1.txt");
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        int num_linhas=0;
        try {
            outputStream = new PrintWriter(new FileWriter("mat1.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                num_linhas++;
                outputStream.println((num_linhas*10)+ " "+ l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            } if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
