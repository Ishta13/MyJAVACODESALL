public class subString {
    public static String string(String str,int si,int ei)
    {
        String substr = "";                    // empty string for making substring
        for(int i=si;i<ei;i++)
        {
            substr+= str.charAt(i);                   // adding each letter to empty string

        }
        return substr;
    }
   public static void main(String[] args) {
     String assqw = "qwertyunion";
     System.out.println(string(assqw,0,5));               //index 0 to n-1(0 to 4)
   }
    
}
