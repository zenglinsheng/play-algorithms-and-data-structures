package A_02_Linear_Search.L_09_Test_Performance;

public class ArrayGenerator {

    private ArrayGenerator() {}

    public static Integer[] generateOrderedArray(int n) {

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i ++)
            arr[i] = i;
        return arr;
    }
}
