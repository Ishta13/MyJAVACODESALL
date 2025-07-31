public class countLowerCase {
    public static String lowerCase(String str)
    {
        StringBuilder st = new StringBuilder("");
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            /*if(str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c'||str.charAt(i)=='d'||str.charAt(i)=='e'||str.charAt(i)=='f'||str.charAt(i)=='g'||str.charAt(i)=='h'||str.charAt(i)=='i'||str.charAt(i)=='j'||str.charAt(i)=='k'||str.charAt(i)=='l'||str.charAt(i)=='m'||str.charAt(i)=='n'||str.charAt(i)=='o'||str.charAt(i)=='p'||str.charAt(i)=='q'||str.charAt(i)=='r'||str.charAt(i)=='s'||str.charAt(i)=='t'||str.charAt(i)=='u'||str.charAt(i)=='v'||str.charAt(i)=='w'||str.charAt(i)=='x'||str.charAt(i)=='y'||str.charAt(i)=='z')
            {
                count++;
                

            }*/
            if (Character.isLowerCase(str.charAt(i)))
            {
                count++;
            }
            
        }
        st.append(count);        //for ke bhr liya taaki baar baar hr no count naa ho

        return st.toString();
        //or
        /*public class CountLowerCase {
            public static int lowerCase(String str) {
                int count = 0; // Initialize count for lowercase letters
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLowerCase(str.charAt(i))) {
                        count++; // Increment count for each lowercase letter
                    }
                }
                return count; // Return the total count of lowercase letters
            }*/
            
    }
    public static void main(String[] args) {
        String qwerty = "hello This is Ishta";
        System.out.println("count of lowercase is: "+lowerCase(qwerty));
    

    }
    
}
