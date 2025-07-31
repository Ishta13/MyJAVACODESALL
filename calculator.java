import java.util.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter a : ");
        Scanner qwerty = new Scanner(System.in);
        float a = qwerty.nextFloat();
        System.out.println("Enter b : ");            // only one scanner is required for new variables 2 or more variables
        float b = qwerty.nextFloat();
        System.out.println("Enter operator");
        char op = qwerty.next().charAt(0);

        switch(op)
        {
            case '+' : System.out.println(a+b);
                       break;
            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;   
            case '/' : if (b!=0)
            {
                       System.out.println(a/b);
            }
                       else
            {
                      System.out.println("divide by 0"); 
            }                      
                       break;        
            default :  System.out.println("operator is invalid");  


        }



     


        
    }
    
}
