package TP2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import TP2.MyList.MyLinkedList;
import TP2.MyList.MyLinkedListIterator;

import static TP2.GlobalVariables.DIRECTORY;

public class SeparateLists {

    private static final MyLinkedList<Person> personsUnder18 = new MyLinkedList<>();
    private static final MyLinkedList<Person> personsOver18 = new MyLinkedList<>();
    private static final MyLinkedList<Person> genderMalePersons = new MyLinkedList<>();
    private static final MyLinkedList<Person> genderFemalePersons = new MyLinkedList<>();

    public static void ByAge(MyLinkedList<Person> persons){
        String fileUnder18 = DIRECTORY + "dadosTXT\\dadosDivididosIdade\\personsAgeUnder18.txt";
        String fileOver18 = DIRECTORY + "dadosTXT\\dadosDivididosIdade\\personsAgeOver18.txt";
        MyLinkedListIterator<Person> myIterator = persons.myIterator();

        try{
            FileWriter fwu = new FileWriter(fileUnder18);
            FileWriter fwo = new FileWriter(fileOver18);

            while (myIterator.hasNext()){
                Person p = myIterator.next();
                if (p.getAge() > 18){
                    personsOver18.add(p);
                    fwo.write(p.getName() + "\n");
                    fwo.write(p.getBirthday() + "\n");
                    fwo.write(p.getTelefone() + "\n");
                }
                else{
                    personsUnder18.add(p);
                    fwu.write(p.getName() + "\n");
                    fwu.write(p.getBirthday() + "\n");
                    fwu.write(p.getTelefone() + "\n");
                }
            }
            fwu.close();
            fwo.close();
        }catch (IOException e){
            System.out.println("algo errado");
        }
    }

    public static void ByGender(MyLinkedList<Person> persons){
        String malePersons = DIRECTORY + "dadosTXT\\dadosDivididosGenero\\malePersons.txt";
        String femalePersons = DIRECTORY + "dadosTXT\\dadosDivididosGenero\\femalePersons.txt";
        MyLinkedListIterator<Person> myIterator = persons.myIterator();

        try{
            FileWriter fwm = new FileWriter(malePersons);
            FileWriter fwf = new FileWriter(femalePersons);

            while (myIterator.hasNext()){
                Person p = myIterator.next();
                if (p.getGender() == 'M'){
                    genderMalePersons.add(p);
                    fwm.write(p.getName() + "\n");
                    fwm.write(p.getBirthday() + "\n");
                    fwm.write(p.getTelefone() + "\n");
                }
                else{
                    genderFemalePersons.add(p);
                    fwf.write(p.getName() + "\n");
                    fwf.write(p.getBirthday() + "\n");
                    fwf.write(p.getTelefone() + "\n");
                }
            }
            fwm.close();
            fwf.close();
        }catch (IOException e){
            System.out.println("algo errado");
        }
    }

    public static void getPersonUnder18(){
        personsUnder18.show();
    }
    public static  void getPersonsOver18(){
        personsOver18.show();
    }
    public static  void malePersons(){
        genderMalePersons.show();
    }
    public static void femalePersons(){
       genderFemalePersons.show();
    }
}
