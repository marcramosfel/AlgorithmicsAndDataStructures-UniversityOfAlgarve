package tp_Aula4;

import java.util.Arrays;

public class BubbleSort {

    public static void orderArray(int[] messyArray) {
        for (int i = 0; i < messyArray.length - 1; i++) {
            for (int j = 0; j < messyArray.length - 1; j++) {
                if (messyArray[j] > messyArray[j + 1]) {
                    // Troca os conteúdos
                    int temp = messyArray[j + 1];
                    messyArray[j + 1] = messyArray[j];
                    messyArray[j] = temp;
                }
            }
        }
    }

    public static int[] showAlgorithm(ReadBinFile file) {
        System.out.println("\n########## BUBBLE SORT ##########");
        int[] arrayOrder = file.getArrayInt();

        long inicio = System.nanoTime();
        BubbleSort.orderArray(arrayOrder);
        long fim = System.nanoTime();

        System.out.println(fim - inicio + " nanoseconds");
        //System.out.println(Arrays.toString(file.getArrayInt()));
        return file.getArrayInt();
    }
}
