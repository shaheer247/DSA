package Strings;
public class Check_String_Palindrome {
    public static boolean check_palindrome(String str){
        for(int i=0;i<str.length();i++){
            if (str.charAt(0)!=str.charAt(str.length()-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abcdcba";
        if(check_palindrome(str)==true){
            System.out.println("String is a Palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }
}
