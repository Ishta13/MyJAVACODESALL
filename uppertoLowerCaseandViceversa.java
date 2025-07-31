public class uppertoLowerCaseandViceversa {
    public static String Case(char ch)
    {
        StringBuilder sc = new StringBuilder("");
        if (ch>='A' && ch<='Z')
        {
           sc.append(Character.toLowerCase(ch));

        }
        return sc.toString();

    }
    public static String Caase(char chi)
    {
        StringBuilder sb = new StringBuilder("");
        if (chi>='a' && chi<='z')
        {
           sb.append(Character.toUpperCase(chi));

        }
        return sb.toString();

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // using bits
    
    public static void main(String[] args) {
        char chi = 'S';
        System.out.println("convert to lowercase is: "+ Case(chi));
        char ch= 'a';
        System.out.println("convert to uppercase is: "+ Caase(ch));

        for (char chin='a'; 
        chin<='z';chin++)
        {
            System.out.print((char) (chin^' ')+ " " ); //typecast is used to convert XOR bitwise operator (integer) result to (character) result

        }       // **chin (ascii value)** and ****space ascii value = 32****
        System.out.println();
        for (char chin='A'; chin<='Z';chin++)
        {
            // **chin (ascii value)** and ****space ascii value = 32****
            System.out.print((char) (chin|' ')+ " " ); //typecast is used to convert OR bitwise operator (integer) result to (character) result

        }

    }
    
}
