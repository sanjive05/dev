package com.leetcode.problems_70;

import java.util.HashSet;

public class Duplicate_217 {
    private static boolean find_dub1(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        for(int i:arr){
            if(hash.contains(i)){
                return true;
            }
            else{
                hash.add(i);
            }
        }
        return false;
    }
    private static boolean find_dub2(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(find_dub2(arr));

    }
}
