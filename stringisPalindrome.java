import java.util.*;
public class stringisPalindrome {
    /*public static boolean isPalindrome(String a)
    {
        int n = a.length();
        for(int i=0;i<a.length()/2;i++){         //to iterate till mid value
            if (a.charAt(i) != a.charAt(n-1-i))   // ab charAt lekr each indivisual value nikl rhe 
                                   //aur as mid value tk hi jaa rhe toh last values using formula nikl rhe
            {
                return false;

            }
        }
        
        return true;
    }*/
    public static void ispalindrome(String str)
    {
        String newstr = "";
        int n = str.length();
        for (int i=0;i<str.length();i++)
        {
            newstr+= str.charAt(n-1-i);           //The expression n-1-i ensures that:
                                                   // When i is 0, n-1-i is n-1, which is the index of the last character.
                                                  // When i is 1, n-1-i is n-2, which is the index of the second-to-last character.
                                                  // And so on...
        }
        if (str.equals(newstr))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String say = sc.nextLine();
        System.out.println("the given string is: ");
        System.out.println(say);
        System.out.println("length of string is "+say.length());
        if(isPalindrome(say))
        {
            System.out.println(say+" is palindrome");
        }
        else
        {
            System.out.println(say + " is not palindrome");
        }*/


        ispalindrome("a");
        

        
    }
    
}
