package com.leetcode.problems_70;

public class FindNum {
    public static void main(String[] args) {
        int n = 22;
        int[] arr = {3,5,7,2,3};
        System.out.println(isPresent (arr,n));
    }

    private static boolean isPresent(int[] arr, int n) {
        for(int i:arr){
            if(i==n){
                return true;
            }
        }
        return false;
    }
}
