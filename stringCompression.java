public class stringCompression {
    public static String stringcompression(String str)
    {
        StringBuilder sc = new StringBuilder("");
                                           //tostring only uses object that's why used
        for(int i=0;i<str.length();i++)
        {                                   //StringBuilder use full object Integer
            Integer count =1;   // for each letter it should count from one kyuki ek letter toh hoga hi
            sc.append(str.charAt(i));          //appending each indivisual character of string
           while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))         //str.length()-1 agr i=n-1 to i+1 = n-1+1 =n so wrong (as started from i index)
           {
               count++;
               i++;
           }
           if(count>1)
           {
             sc.append(count);   //jo each letter ke no vo append kre
           }
        }
        return sc.toString();

    }

    public static void main(String[] args) {
        String av = "aaabbccc";                       //only works if char>1 else string becomes larger
        String res=stringcompression(av);
        System.out.println("string compressed is: "+res);

    }
    
}
