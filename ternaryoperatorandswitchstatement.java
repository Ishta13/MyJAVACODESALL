import java.util.*;
public class ternaryoperatorandswitchstatement {
    public static void main(String[] args) {
        // ternary operator
        int marks = 33;
        String result = marks>=33? "PASS":"FAiL";
        System.out.println(result); 

        int year = 2004;
        String ly = ((year%4==0) && (year%100!=0 || year%400==0)) ? "leap year":"not leap year";
        System.out.println(ly);


        // switch statement
        System.out.println("Enter day");
        Scanner week = new Scanner(System.in);
        int days = week.nextInt();
        switch (days)
        {
            case 1: System.out.println("monday");
                    break;
            case 2: System.out.println("tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("not a valid day");   
            
            

            



        }



        




        
    }
    
}
