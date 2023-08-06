package com.Arrays_2D;

public class searchelement_Binary_Search_2D {
    public static void searchelement_Binary_Search_2D(int [][]arr,int m,int n,int x){
        int start=0;
        m= arr.length;
        n=arr[0].length;
        int end=m*n-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            int row=mid/n;
            int col=mid%n;
            int element=arr[row][col];
            if(x>element){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(element==x){
                System.out.println("Element found at index:("+row+","+col+")");
            }
            mid=start+(end-start)/2;
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
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int m=3;
        int n=3;
        printArray(matrix,m,n);
        searchelement_Binary_Search_2D(matrix,m,n,8);
    }
}
