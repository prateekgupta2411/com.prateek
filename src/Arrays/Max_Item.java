package Arrays;public class Max_Item {    public static void main(String[] args) {        int[] arr = {2, 3, 4, 5, 15};        System.out.println(max(arr));    }    //Imagine that arr is not empty    static int max(int[] arr) {        if (arr.length == 0) {            return -1;        }        int maxVal = arr[0];        //int maxVal = Integer.MAX_VALUE; // if the array is empty simply u can do this        for (int i = 1; i < arr.length; i++) {            if (arr[i] > maxVal) {                maxVal = arr[i];            }        }        return maxVal;    }}