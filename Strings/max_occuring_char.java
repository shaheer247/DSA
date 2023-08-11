package Strings;
public class max_occuring_char {
        static char maxOccurringChar(String str){
            int count []=new int [256];
            int n=str.length();
            int maxfreq=0;
            char ch=' ';
            for(int i=0;i<=n-1;i++) {
                count[str.charAt(i)] = count[str.charAt(i)] + 1;
                if(maxfreq<count[str.charAt(i)]){
                    maxfreq=count[str.charAt(i)];
                    ch=str.charAt(i);
                }
            }
            return ch;

    }
        public static void main(String[] args) {
            String str = "abbcccddd";
            System.out.println("Maximum occurring character is :" + maxOccurringChar(str));
        }
    }