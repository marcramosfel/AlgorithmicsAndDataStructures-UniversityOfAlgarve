package tp_Aula4;

import java.util.Scanner;

public class DemoReadBinFile {
    public static void main(String[] args) {
        System.out.println("WHAT FILE YOU WANT TO ORGANIZE?" +
                "\n(1) FILE WITH 10 NUMBERS" +
                "\n(2) FILE WITH 100 NUMBERS" +
                "\n(3) FILE WITH 1000 NUMBERS" +
                "\n(4) FILE WITH 10000 NUMBERS" +
                "\n(5) FILE WITH 100000 NUMBERS" +
                "\n(6) FILE WITH 1000000 NUMBERS");

        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();

        if (option == 1){
            ReadBinFile messyFileShell = new ReadBinFile("messyFile10.bin");
            ReadBinFile messyFileQuick = new ReadBinFile("messyFile10.bin");
            ReadBinFile messyFileBubble = new ReadBinFile("messyFile10.bin");

            System.out.println("\nOrganizing Array with three different algorithms:");

            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);

            int [] orderBubble = BubbleSort.showAlgorithm(messyFileBubble);

            saveOrderFiles(orderQuick, orderShell, orderBubble,
                    "tenNumbers\\orderFileQuick10.bin", "tenNumbers\\orderFileShell10.bin", "tenNumbers\\orderFileBubble10.bin");
            }
        else if(option == 2){

            ReadBinFile messyFileShell = new ReadBinFile("teste100.bin");
            ReadBinFile messyFileQuick = new ReadBinFile("teste100.bin");
            ReadBinFile messyFileBubble = new ReadBinFile("teste100.bin");


            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);

            int [] orderBubble = BubbleSort.showAlgorithm(messyFileBubble);

            saveOrderFiles(orderQuick, orderShell, orderBubble,
                    "hundredNumbers\\orderFileQuick100.bin", "hundredNumbers\\orderFileShell100.bin", "hundredNumbers\\orderFileBubble100.bin");
        }
        else if(option == 3){
            ReadBinFile messyFileShell = new ReadBinFile("messyFile1000.bin");
            ReadBinFile messyFileQuick = new ReadBinFile("messyFile1000.bin");
            ReadBinFile messyFileBubble = new ReadBinFile("messyFile1000.bin");


            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);

            int [] orderBubble = BubbleSort.showAlgorithm(messyFileBubble);

            saveOrderFiles(orderQuick, orderShell, orderBubble,
                    "thousandNumbers\\orderFileQuick1000.bin", "thousandNumbers\\orderFileShell1000.bin", "thousandNumbers\\orderFileBubble1000.bin");
        }
        else if(option == 4){
            ReadBinFile messyFileShell = new ReadBinFile("messyFile10000.bin");
            ReadBinFile messyFileQuick = new ReadBinFile("messyFile10000.bin");
            ReadBinFile messyFileBubble = new ReadBinFile("messyFile10000.bin");


            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);

            int [] orderBubble = BubbleSort.showAlgorithm(messyFileBubble);

            saveOrderFiles(orderQuick, orderShell, orderBubble,
                    "tenThousandNumbers\\orderFileQuick10000.bin", "tenThousandNumbers\\orderFileShell10000.bin", "tenThousandNumbers\\orderFileBubble10000.bin");
        }
        else if(option == 5){
            ReadBinFile messyFileShell = new ReadBinFile("messyFile100000.bin");
            ReadBinFile messyFileQuick = new ReadBinFile("messyFile100000.bin");
            ReadBinFile messyFileBubble = new ReadBinFile("messyFile100000.bin");


            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);

            int [] orderBubble = BubbleSort.showAlgorithm(messyFileBubble);

            saveOrderFiles(orderQuick, orderShell, orderBubble,
                    "hundredThousandNumbers\\orderFileQuick100000.bin", "hundredThousandNumbers\\orderFileShell100000.bin", "hundredThousandNumbers\\orderFileBubble100000.bin");
        }
        else if(option == 6){
            ReadBinFile messyFileShell = new ReadBinFile("messyFile1000000.bin");
            ReadBinFile messyFileQuick = new ReadBinFile("messyFile1000000.bin");
            ReadBinFile messyFileBubble = new ReadBinFile("messyFile1000000.bin");


            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);

            int [] orderBubble = BubbleSort.showAlgorithm(messyFileBubble);

            saveOrderFiles(orderQuick, orderShell, orderBubble,
                    "milionNumbers\\orderFileQuick1000000.bin", "milionNumbers\\orderFileShell1000000.bin", "milionNumbers\\orderFileBubble1000000.bin");
        }
        else if(option == 7){
            ReadBinFile messyFileShell = new ReadBinFile("messyFileTenMilion.bin");
            //ReadBinFile messyFileQuick = new ReadBinFile("messyFileTenMilion.bin");


            int [] orderShell = ShellSort.showAlgorithm(messyFileShell);

            //int [] orderQuick = QuickSort.showAlgorithm(messyFileQuick);


//            saveOrderFiles(orderQuick, orderShell, orderBubble,
  //                  "milionNumbers\\orderFileQuick1000000.bin", "milionNumbers\\orderFileShell1000000.bin", "milionNumbers\\orderFileBubble1000000.bin");
        }

        //System.out.println("\nReading the order file!");
        //System.out.println(Arrays.toString(orderFile.getArrayInt()));
    }

    public static void saveOrderFiles(int[] quick, int[] shell, int[] bubble, String fileQuick, String fileShell, String fileBubble){
        System.out.println("\nSaving the file ordered in a bin file!");
        CreateBinFile.createOrderFile(fileQuick, quick);
        System.out.println(fileQuick +" CREATED AND WAS ORGANIZED BY QUICK SORT\n...");
        CreateBinFile.createOrderFile(fileShell, shell);
        System.out.println(fileShell + " CREATED AND WAS ORGANIZED BY SHELL SORT\n...");
        CreateBinFile.createOrderFile(fileBubble, bubble);
        System.out.println(fileBubble + " CREATED AND WAS ORGANIZED BY BUBBLE SORT\n...");
    }
}
