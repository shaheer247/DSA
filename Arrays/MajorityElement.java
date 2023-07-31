package com.Arrays;

public class MajorityElement {
    //majority element
    public static void majorityele(int []arr,int n) {
        n = arr.length;
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        //checking the stored element is majority element
        count=0;
        for (int i=0;i<n;i++){
            if(element==arr[i]){
                count++;
            }
        }
        if(count>n/2){
            System.out.println("The majority element:"+element);
        }
        else {
            System.out.println("majority element not found");
        }
    }
    public static void main(String[] args) {
        int []nums={2, 2, 1, 1, 1,1,1, 2, 2};
        int n= nums.length;
        majorityele(nums,n);
    }
}
