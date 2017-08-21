package main.algorithm.sort;

public class MergeSortMain {
    public static int[] sorted = new int[30];

    public static void mergeSort(int[] arr, int start, int end) {
        int middle;
        if (start < end) {
            middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int i, j, k, t;
        i = start;
        j = middle + 1;
        k = start;

        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j])
                sorted[k] = arr[i++];
            else
                sorted[k] = arr[j++];
            k++;
        }

        if (i > middle) {
            for (t = j; t <= end; t++, k++)
                sorted[k] = arr[t];
        } else {
            for (t = i; t <= middle; t++, k++)
                sorted[k] = arr[t];
        }

        for (t = start; t <= end; t++)
            arr[t] = sorted[t];

        sortedPrint(arr);

    }

    private static void sortedPrint(int[] arr) {
        for (int ii=0;ii < arr.length-1; ii++)
            System.out.print(arr[ii] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = { 70, 8, 5, 2, 16, 9, 31, 22 };
        MergeSortMain.mergeSort(arr,0,arr.length-1);

    }

}
