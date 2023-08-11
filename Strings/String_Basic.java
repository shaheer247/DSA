package Strings;
import java.util.Scanner;

public class String_Basic{

public static void print(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        System.out.println("Your name is:"+name);
        System.out.println(name.length());
        String Lowercase=name.toLowerCase();
        System.out.println(Lowercase);
        String Uppercase=name.toUpperCase();
        System.out.println(Uppercase);
        String Substring=name.substring(2);
        System.out.println(Substring);
        String Substring2=name.substring(0,7);
        System.out.println(Substring2);
        String replace=name.replace('r','n');
        System.out.println(replace);
        String Firstname="Steve";
        String Lastname="Rogers";
        String Fullname=Firstname+" "+Lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.charAt(3));
        print(Fullname);
    }
}
