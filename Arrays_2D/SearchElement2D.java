package com.Arrays_2D;
import java.util.*;

public class SearchElement2D {
    public static int searchelement(int [][]arr,int m,int n,int x){
        for(int row=0;row<m;row++){
            for (int col=0;col<n;col++){
                if(arr[row][col]==x){
                    System.out.println("Element found at:("+row+","+col+")");
                    return 1;
                }
            }
        }
        System.out.println("Element not found.");
        return 0;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and col size:");
        int row=sc.nextInt();
        int col= sc.nextInt();
        int [][]arr=new int [row][col];
        System.out.println("Enter elements of array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        printArray(arr,row,col);
        System.out.println("Enter element to search:");
        int x=sc.nextInt();
        searchelement(arr,row,col,x);
            }
        }


