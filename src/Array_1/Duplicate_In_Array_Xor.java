package Array_1;public class Duplicate_In_Array_Xor {    public static void main(String[] args) {        int[] arr = {1, 2, 3, 4, 5,6,6};        System.out.println(duplicate(arr));    }        static int duplicate(int[] arr) {            int ans = 0;            for (int i = 0; i < arr.length; i++) {                ans = ans ^ arr[i];            }            for (int i = 1; i < arr.length; i++) {                ans = ans ^ i;            }            return ans;        }    }