package TP2;

import static TP2.FileClasses.CreateBinFileData.createBinFile;
import static TP2.FileClasses.ReadBinFileData.readBinFile;
import TP2.MyList.MyLinkedList;

public class Main implements GlobalVariables {

    public static void main(String[] args) {
        //TRANSFORMA O FICHEIRO TXT PARA BINARIO
        createBinFile(GlobalVariables.nameTxtFile);

        //myListOfPersons É A LISTA QUE É RETORNADA PELO METODO READBINFILE, ESTE METODO LE E ADICIONA AUTOMATICAMENETE A LISTA
        MyLinkedList<Person> myListOfPersons = readBinFile(GlobalVariables.nameBinFile);

        //PERMITE A INTRODUÇÃO DE NOVOS ELEMENTOS
        myListOfPersons.add(new Person("Marcos Ramos", 1999,12,15, 262834251));
        myListOfPersons.add(new Person("Luis Castro", 1989, 8, 31, 917812128));
        myListOfPersons.add(new Person("Mariana Goncalvez", 1972, 12, 17, 928719271));

        //PERMITE A VISUALIZACAO DOS ELEMENTOS DA LISTA
        System.out.println("\n++++++++++++ LISTA DE PESSOAS ++++++++++++ ");
        myListOfPersons.show();

        System.out.println();

        //SEPARA POR IDADE E GRAVA EM FICHEIROS RESPETIVOS
        System.out.println("\n++++++++++++ SEPARANDO LISTA POR IDADE ++++++++++++  \n....");
        SeparateLists.ByAge(myListOfPersons);
        System.out.println("\n++++++++++++ OVER 18 ++++++++++++ ");
        SeparateLists.getPersonsOver18();
        System.out.println("\n++++++++++++ UNDER 18 ++++++++++++");
        SeparateLists.getPersonUnder18();

        //SEPARA POR GENERO E GRAVA EM FICHEIROS RESPETIVOS
        System.out.println("\n++++++++++++ SEPARANDO LISTA POR GENERO ++++++++++++  \n....");
        SeparateLists.ByGender(myListOfPersons);
        System.out.println("\n++++++++++++ MALE ++++++++++++ ");
        SeparateLists.malePersons();
        System.out.println("\n++++++++++++ FEMALE ++++++++++++ ");
        SeparateLists.femalePersons();

    }
}
