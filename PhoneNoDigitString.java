public class PhoneNoDigitString {
    final static char L[][]= {{},{},{'a', 'b', 'c'},{'d', 'e', 'f'},{'g', 'h', 'i'},
        {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public static void strCombination(String d){
        int len = d.length();
        if (len==0)
        {
            System.out.println(" ");
            return;
        }
        stringNo(0,len,d,new StringBuilder());  //if len not equal to 0 then call the func
    }
    public static void stringNo(int pos,int len,String d, StringBuilder sb)
    {
        if(pos==len)
        {
            System.out.println(sb.toString()); //pos==at last of string then at end change to string
            return;
        }
        char letter[] = L[Character.getNumericValue(d.charAt(pos))]; //to get numeric value of each character string //char at indx pos numericValue
        for(int i=0;i<letter.length;i++)
        {
            stringNo(pos+1,len,d,new StringBuilder(sb).append(letter[i])); // incr pos now appending to stringbuilder and append the letter
        }


    }
    public static void main(String[] args) {
        strCombination("3");
    }

    
}
