public class stringLowercasetoUppercase {
    public static String toUpperCase(String str)
    {
        StringBuilder qwerty= new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        qwerty.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)      // i<n-1 kyuki last letter ke aage ki space ko append nhi krna
            {
                qwerty.append(str.charAt(i));       //space append krwao
                i++;                  // phir aage badho
                qwerty.append(Character.toUpperCase(str.charAt(i)));      //ab space ke aage wala letter Uppercase me covnvert than leave loop
            }
            else{
                qwerty.append(str.charAt(i));
            }
        }
        return qwerty.toString();
    }
    public static void main(String[] args) {
        String qwerty= "Hi, my name is ishta";
        System.out.println("convert 1st letter to uppercase is: "+toUpperCase(qwerty));
    }
    
}
