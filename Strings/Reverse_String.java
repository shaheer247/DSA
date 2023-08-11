package Strings;
public class Reverse_String {
    public static void main(String[] args) {
        String str="Shaheer";
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr+=str.charAt(i);
        }
        System.out.println("The String is:"+str);
        System.out.println("The Reversed String is:"+revstr);
    }
}
