package com.Arrays_2D;

public class Waveprint {
    public static void Waveprint(int[][]arr,int m,int n) {
        for(int col=0;col<n;col++){
            if(col%2==0){
                for(int row=0;row<m;row++){
                    System.out.print(arr[row][col]+" ");
                }
            }
            else {
                for(int row=m-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
            }
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
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m=3;
        int n=4;
        printArray(matrix,m,n);
        Waveprint(matrix,m,n);
    }
}
