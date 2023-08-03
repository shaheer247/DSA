package com.Arrays;
import java.util.Scanner;
public class sqrtinteger {
    public static long sqrtint(long num){
        long s=0;
        long e=num;
        long ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==num){
                return mid;
            }
            else if(mid*mid>num){
                e=mid-1;
            }
            else{
                ans=mid;

                s=mid+1;
            }
        }
        return ans;
    }
    public static double moreprecision(long num,long precision,long res){
        double fact=1;
        double ans=res;
        for(int i=0;i<precision;i++){
            fact=fact/10;
            for(double j=ans;j*j<num;j=j+fact){
                ans=j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long num= sc.nextLong();
        long res=sqrtint(num) ;
        System.out.println("Answer is:"+moreprecision(num,3,res));

    }
}
