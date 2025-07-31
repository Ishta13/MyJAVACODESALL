import java.util.*;
public class compareStrings {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        if (s1==s2)
        {
            System.out.println(s1+ " is equal to: "+ s2);
        }
        else
        {
            System.out.println(s1+ " is not equal to: "+ s2);
        }
        // for taking string from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s3 = sc.nextLine();
        if (s1.equals(s3))                      // .equals ('A'not equal to 'a')
        {
            System.out.println(s1+ " is equal to: "+ s3);
        }
        else
        {
            System.out.println(s1+ " is not equal to: "+ s3);
        }
        


        
    }
    
}
