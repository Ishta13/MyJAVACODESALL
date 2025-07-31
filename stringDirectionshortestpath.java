import java.util.*;
public class stringDirectionshortestpath {
    public static float shortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir = path.charAt(i);       //kyuki dir sirf single character le rha
        // south
        if (dir =='S')
        {
            y--;
        }
        // north
        else if (dir == 'N'){
            y++;
        }
        // east
        else if (dir =='E'){
            x++;
        }
        // west
        else 
        {
            x--;
        }
       
    }
    int X2 = x*x;            //not use pow func kyuki double use hoga toh error
    int Y2 = y*y;
           
    return (float)Math.sqrt(X2+Y2);   // kyuki pow aur sqrt double me aata toh typecast float taaki accurate distance mile
    
    //or
    /*double X2 = Math.pow(x, 2);
    double Y2 = Math.pow(y, 2);
    float dis = (float) Math.sqrt(X2 + Y2); // Calculate the distance correctly
    
    return dis;*/
}
public static void main(String[] args) {
    String direction = "NNSEWESSSNN";
    System.out.println("shortest dis is: "+ shortestPath(direction));

}
}
