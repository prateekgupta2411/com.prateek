package Arrays;public class Max_Item_In_Range {    public static void main(String[] args) {        int[] arr = {3, 4, 50, 25, 30, 200, 250, 300};        System.out.println(max(arr, 4, 6));    }    // WORK ON EDGE CASES HERE , LIKE ARRAY BEING NULL    static int max(int[] arr, int range1, int range2) {        if (range2 > range1) {            return -1;        }        if (arr == null) {            return -1;        }        int maxElement = arr[range1];        for (int i = range1; i <= range2; i++) {            if (arr[i] > maxElement) {                maxElement = arr[i];            }        }        return maxElement;    }}