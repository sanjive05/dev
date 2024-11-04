package com.leetcode.problems_70;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        int n=arr.length;
        int actual_sum = n*(n+1)/2;
        int current_sum = 0;
        for(int i=0;i<n;i++){
            current_sum+=arr[i];
        }
        System.out.println("Ans  :  "+(actual_sum-current_sum));
    }
}
