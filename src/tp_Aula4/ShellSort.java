package tp_Aula4;
// Shell sort in Java programming

import java.util.Arrays;

// Shell sort
class ShellSort {
    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    static void shellSort(int[] array, int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }
    public static int[] showAlgorithm(ReadBinFile file) {
        System.out.println("\n########## SHELL SORT ##########");
        int [] arrayOrder = file.getArrayInt();
        int size = file.getArrayInt().length;

        long inicio = System.nanoTime();
        ShellSort.shellSort(arrayOrder, size);
        long fim = System.nanoTime();

        System.out.println(fim-inicio + " nanoseconds");
        //System.out.println(Arrays.toString(arrayOrder));
        return file.getArrayInt();

    }

}
