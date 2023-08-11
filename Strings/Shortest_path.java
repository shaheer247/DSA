package Strings;
public class Shortest_path {
    public static float get_shortest_path(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            int dir=path.charAt(i);
            //South
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //West
            else {
                x--;
            }
        }
        float Xsquare=x*x;
        float Ysquare=y*y;
        return(float)Math.sqrt(Xsquare+Ysquare);
    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println("The Shortest path is:"+get_shortest_path(path));
    }
}
