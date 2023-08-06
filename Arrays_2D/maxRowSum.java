package com.Arrays_2D;

public class maxRowSum {
    public static void maxrowsum(int[][]arr,int m,int n){
        int maxsum=Integer.MIN_VALUE;
        for(int row=0;row<m;row++){
            int sum=0;
            for (int col=0;col<n;col++){
                sum+=arr[row][col];
            }
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println("The max row sum:"+maxsum);

    }
    public static void printArray(int [][]arr,int m,int n){
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int m=3,n=3;
        printArray(matrix,m,n);
        maxrowsum(matrix,m,n);
    }
}
