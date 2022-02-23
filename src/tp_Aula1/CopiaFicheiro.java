package tp_Aula1;
import java.io.*;

public class CopiaFicheiro {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
            String str = "";
            while ((str = in.readLine()) != null) {
                System.out.println(str+"\n");
                out.write(str+"\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Erro de entrada\n");

        }
    }
}

