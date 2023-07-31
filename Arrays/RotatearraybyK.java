package com.Arrays;
public class RotatearraybyK {
    //Rotate array by k places
    public static void rotatearraybyk(int [] arr,int n,int k){
        k=k% arr.length;
        if(k<0){
            k=k+ arr.length;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }
    public static void reverse(int [] arr,int start,int end){
        int temp=0;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
          int nums[]={1,2,3,4,5,6,7};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        rotatearraybyk(nums,n,4);
        System.out.println(java.util.Arrays.toString(nums));
    }

}
