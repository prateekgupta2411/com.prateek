package Leetcode_Arr;public class Richest_Customer_Wealth_1672 {    public static void main(String[] args) {        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};    }    public int maximumWealth(int[][] accounts) {        // person = row        // account = col        int ans = Integer.MIN_VALUE;//        for (int person = 0; person < accounts.length; person++) {//            //when you start a new col, take a new sum for that row//            int rowsum = 0;//            for (int account = 0; account < accounts[person].length; account++) {//                rowsum += accounts[person][account];//////            }        for (int[] ints : accounts) {            //when you start a new col, take a new sum for that row            int rowsum = 0;            for (int anInt : ints) {                rowsum += anInt;            }            //now we have sum of accounts of person            //chech with main answer            if (rowsum > ans) {                ans = rowsum;            }        }        return ans;    }}