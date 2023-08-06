package com.Arrays_2D;

public class SpiralPrint {
    public static void SpiralPrint(int [][]arr,int m,int n){
        int startingRow=0;
        int endingRow= m-1;
        int startingCol=0;
        int endingCol=n-1;
        while (startingRow<=endingRow && startingCol<=endingCol) {
            //for starting Row
            for (int i = startingCol; i <= endingCol; i++) {
                System.out.print(arr[startingRow][i] + " ");
            }
            startingRow++;
            //for ending col
            for (int i = startingRow; i <= endingRow; i++) {
                System.out.print(arr[i][endingCol] + " ");
            }
            endingCol--;
            //for ending row
            if (startingRow <= endingRow) {
                for (int i = endingCol; i >= startingCol; i--) {
                    System.out.print(arr[endingRow][i] + " ");
                }

                endingRow--;
            }
            //for staring col
            if (startingCol <= endingCol) {
                for (int i = endingRow; i >= startingRow; i--) {
                    System.out.print(arr[i][startingCol] + " ");
                }
                startingCol++;
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
        int [][]matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int m=4;
        int n=5;
        printArray(matrix,m,n);
        SpiralPrint(matrix,m,n);
    }
}

