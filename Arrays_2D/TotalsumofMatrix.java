package com.Arrays_2D;

public class TotalsumofMatrix {
        public static void TotalsumofMatrix(int[][]arr,int m,int n) {
            int sum = 0;
            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    sum += arr[row][col];
                }
            }
            System.out.println("Total Sum of Matrix:" + sum);
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
            TotalsumofMatrix(matrix,m,n);
        }
    }

