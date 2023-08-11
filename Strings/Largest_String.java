package Strings;

public class Largest_String {
    public static String largest_string(String[]str){
        int n= str.length;
        String largest=str[0];
        for(int i=1;i<=n-1;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        String []a={"Apple","Mango","Orange"};
        System.out.println("The largest String:"+largest_string(a));
    }
}
