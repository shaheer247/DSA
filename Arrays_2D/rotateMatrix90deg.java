package com.Arrays_2D;

public class rotateMatrix90deg {
    public static void rotateMatrix90deg(int [][]arr,int m,int n){
        for(int col=0;col<m;col++){
            for(int row=n-1;row>=0;row--){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
    public static void printArray(int [][]arr,int m,int n) {
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=4;
        int n=4;
        printArray(matrix,m,n);
        System.out.println("After 90deg rotate:");
        rotateMatrix90deg(matrix,m,n);
    }
}
