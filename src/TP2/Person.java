package TP2;

import TP2.HashMap.HashMapGender;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import static TP2.HashMap.HashMapGender.updateFileGenderTable;

public class Person {

    private String name;

    private LocalDate birthday;
    private int telefone;
    private int age;
    private char gender;

    public Person(String name, int ano, int mes, int dia, int telefone) {
        this.name = name;
        this.birthday = LocalDate.of(ano, mes, dia);
        this.telefone = telefone;
        this.age = calculateAge();
        this.gender = calculateGender(this.getFirstName());
    }

    public char compareHashMap() {
        HashMap<String, Character> myGenderHashMap = HashMapGender.readFileGenderTable(GlobalVariables.nameTxtGenderFileTable);
        if(myGenderHashMap.containsKey(this.getFirstName())){
            return myGenderHashMap.get(this.getFirstName());
        }else{
            System.out.println("Nao foi possivel encontrar »»»»» " + this.getFirstName() + " ««««« na look up table!");
            System.out.println("Adicionar nome com qual genero? F/M");

            Scanner in = new Scanner(System.in);
            char genero = in.next().charAt(0);
            updateFileGenderTable(GlobalVariables.nameTxtGenderFileTable, this.getFirstName(), genero);
            return genero;
        }
    }

    public char calculateGender(String firstName){
        if (firstName.charAt(firstName.length()-1) == 'a') return 'F';
        else if (firstName.charAt(firstName.length()-1) == 'o') return 'M';
        else{
            return compareHashMap();
        }
    }


    public String getFirstName(){
        return this.name.split(" ")[0];
    }

    public int getTelefone() {
        return telefone;
    }

    public int calculateAge(){
        //https://www.guj.com.br/t/como-calcular-a-idade/28810/6

        int ano = 0, mes = 0, dia = 0;

        // Idade.
        int idade = 0;


        ano = LocalDate.now().getYear();
        mes = LocalDate.now().getMonthValue() + 1;
        dia = LocalDate.now().getDayOfMonth();

        int anoNasc = this.getBirthday().getYear();
        int mesNasc = this.getBirthday().getMonthValue() + 1;
        int diaNasc = this.getBirthday().getDayOfMonth();

        idade = ano - anoNasc;

        // Calculando diferencas de mes e dia.
        if(mes < mesNasc) {
            idade--;
        } else {
            if(dia < diaNasc) {
                idade--;
            }
        }

        // Ultimo teste, idade "negativa".
        if(idade < 0) {
            idade = 0;
        }

        return (idade);
    }

    public int getAge() {return age;}

    public LocalDate getBirthday() {return birthday;}

    public char getGender() {return gender;}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "#######################" +
                "\nName: " + name +
                "\nBirthday: " + birthday +
                "\nPhone: " + telefone +
                "\nAge: " + age +
                "\nGender: " + gender;
    }


}
