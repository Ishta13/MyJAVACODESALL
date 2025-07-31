import java.util.*;
public class stringBasics {
    public static void strings(String str)
    {
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");       // to iterate through each letter jaise array me through each index/element
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String answer = sc.next(); //takes just one word     //Using nextLine for both inputs: The use of *nextLine* 
        //after *next* can cause issues because next does not consume the newline character, 
        //so nextLine reads the remaining newline. Instead, you can use nextLine for both inputs.
        System.out.println("Hi "+ answer);
        System.out.println("Enter your name");
        String qwerty = sc.nextLine();  // takes entire line
        System.out.println("hello "+ qwerty);
        System.out.println("iterating through each letter");
        strings(answer);

    }
    
}
