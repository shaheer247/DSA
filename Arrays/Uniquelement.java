package com.Arrays;

public class Uniquelement {
    // find unique element
    public static int uniqueelement(int [] arr,int n){
        n= arr.length;

        int xorr=0;
        for(int i=0;i<n;i++){
            xorr^=arr[i];
        }
        return  xorr;
    }

    public static void main(String[] args) {
        int [] nums={1,2,2,1,4};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int result=uniqueelement(nums,n);
         System.out.println("The unique element is:"+result);

    }
}
