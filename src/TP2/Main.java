package TP2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import static TP2.ReadBinFile.readBinFile;

public class Main {

    public static LocalDate convertStringLocalDate(String data){
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static void main(String[] args) {
        //createBinFile("Dados.txt");
        String dados = readBinFile("Dados.bin");

        String[] array;
        array = dados.split("\n");

        LinkedList<Person> myListOfPersons = new LinkedList<>();

        for (int i = 0; i < array.length; i++){
            myListOfPersons.add(new Person(array[i++], convertStringLocalDate(array[i++]), Integer.parseInt(array[i])));
        }

        myListOfPersons.add(new Person("Marcos Ramos", LocalDate.parse("15/12/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 262834251));

        for(Person p : myListOfPersons){
            System.out.println("\n#######################");
            System.out.println("Name: " + p.getName() + "\nBirthday: " + p.getBirthday() + "\nCC: " +  p.getCc() + "\nAge: " + p.getAge() + "\nGender: " + p.getGender());
        }
    }
}
