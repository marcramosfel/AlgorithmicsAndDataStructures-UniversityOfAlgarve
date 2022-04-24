package TP2;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;
    private int cc;
    private int age;

    private char gender;

    public Person(String name, LocalDate birthday, int cc) {
        this.name = name;
        this.birthday = birthday;
        this.cc = cc;
        this.age = calculateAge();
        this.gender = calculateGender(this.name);
    }

    public char calculateGender(String name){
        String firstName = name.split(" ")[0];
        if (firstName.charAt(firstName.length()-1) == 'a') return 'F';
        else if (firstName.charAt(firstName.length()-1) == 'o') return 'M';
        else{
            return 'N';
        }
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

    public String getName() {return name;}

    public int getAge() {return age;}

    public LocalDate getBirthday() {return birthday;}

    public int getCc() {return cc;}

    public char getGender() {return gender;}

}
