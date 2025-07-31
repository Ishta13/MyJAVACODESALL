public class BinaryStringProb {
    public static void binstr(int n, int lastplace , String str)  //don't take stringbuilder otherwise error
    {
        if (n==0)
        {
            System.out.println(str);
            return; 
        }
        binstr(n-1, 0, str+"0"); //always true except empty or space string
        if (lastplace == 0)
        {
        binstr(n-1, 1, str+"1");  //only true if last str is 0
         }
        
            
}
    public static void main(String[] args) {
        binstr(3, 0, " ");
    }
}
