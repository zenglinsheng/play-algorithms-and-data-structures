package A_04_Insertion_Sort.L_04_Insertion_Sort_Features;

import java.util.Arrays;

public class InsertionSort {

    private InsertionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){

        for(int i = 0; i < arr.length; i ++){

            // 将 arr[i] 插入到合适的位置
            E t = arr[i];
            int j;
            for(j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j --){
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    public static <E extends  Comparable<E>> void sort2(E[] arr) {

        for (int i = arr.length - 1;i >= 0;i --) {
            E tmp = arr[i];
            int j = i;
            for (;j + 1 <= arr.length - 1 && tmp.compareTo(arr[j + 1]) > 0;j ++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = tmp;
        }
    }

    public static <E extends  Comparable<E>> void sort3(E[] arr) {
        for (int i = 1;i < arr.length;i ++) {
            E tmp = arr[i];
            int j = i;
            for (;j - 1 >= 0 && tmp.compareTo(arr[j - 1]) < 0;j --) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }

    private static <E extends Comparable<E>> boolean isSorted(E[] arr){

        for(int i = 1; i < arr.length; i ++)
            if(arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 1, 4, 3, 6, 5};
        InsertionSort.sort2(arr);
        for (Integer i: arr)
            System.out.print(i + " ");

//        int[] dataSize = {1000, 10000};
//        for(int n: dataSize){
//
//            System.out.println("Random Array : ");
//
//            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
//            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
//            SortingHelper.sortTest("InsertionSort", arr);
//            SortingHelper.sortTest("SelectionSort", arr2);
//
//            System.out.println();
//
//            System.out.println("Ordered Array : ");
//
//            arr = ArrayGenerator.generateOrderedArray(n);
//            arr2 = Arrays.copyOf(arr, arr.length);
//            SortingHelper.sortTest("InsertionSort", arr);
//            SortingHelper.sortTest("SelectionSort", arr2);
//
//            System.out.println();
//        }
    }
}
