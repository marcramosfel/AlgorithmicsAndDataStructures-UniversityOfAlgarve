package TP2.FileClasses;

import TP2.GlobalVariables;
import TP2.Person;
import TP2.MyList.MyLinkedList;
import java.io.*;


public class ReadBinFileData implements GlobalVariables {

    private static final String DIRECTORY = GlobalVariables.DIRECTORY;

    public static MyLinkedList<Person> readBinFile (String fileName){
        MyLinkedList<Person> myListOfPersons = new MyLinkedList<>();

        try {
            FileInputStream fpin = new FileInputStream(DIRECTORY + "dadosBIN\\" + fileName);
            DataInputStream in = new DataInputStream(fpin);

            System.out.println("\nREADING FILE...\n");
            StringBuilder name = new StringBuilder();
            while (true) {
                int tamanhoNome = in.readByte();
                System.out.println(tamanhoNome);
                for (int j = 0; j < tamanhoNome; j++) {
                    name.append((char) in.read());
                }
                int dia = in.readByte();
                int mes = in.readByte();
                int ano = in.readInt();
                int telefone = in.readInt();

                myListOfPersons.add(new Person(String.valueOf(name), ano, mes, dia, telefone));
                name.delete(0, name.length());
            }
        }catch(EOFException e){
            System.out.println("End of file!\n");

        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
        return myListOfPersons;
    }
}

