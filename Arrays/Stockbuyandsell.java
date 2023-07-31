package com.Arrays;

public class Stockbuyandsell {
    //stock buy and sell
    public static void stockbuysell(int []arr,int n){
        n= arr.length;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i=0;i<n;i++){
            if(arr[i]<minprice){
                minprice=arr[i];
            }
            int profit=arr[i]-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        System.out.println("The min price we can buy a stock is:"+minprice);
        System.out.println("The max price we can sell a stock is:"+maxprofit);
    }

    public static void main(String[] args) {
        int []nums={7,1,5,3,6,4};
        int n= nums.length;
        stockbuysell(nums,n);
    }
}
