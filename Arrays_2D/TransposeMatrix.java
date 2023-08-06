package com.Arrays_2D;
public class TransposeMatrix {
    public static void TransposeMatrix(int [][]arr,int m,int n){
        for(int row=0;row<m-1;row++){
            for(int col=row+1;col<n;col++){
                int temp=arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
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
        int [][] matrix={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int m=4;
        int n=4;
        printArray(matrix,m,n);

        TransposeMatrix(matrix,m,n);
        System.out.println("The Transposed matrix:");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

}
