import java.util.*;
public class ifelsestatements {
    public static void main(String[] args) {

        // find largest no among three
        /*System.out.println("Enter no");
        Scanner all = new Scanner(System.in);
        float a = all.nextFloat();


        System.out.println("Enter no");
        Scanner alli = new Scanner(System.in);
        float b = alli.nextFloat();

        System.out.println("Enter no");
        Scanner allin = new Scanner(System.in);
        float c = allin.nextFloat();

        if (a>b && a>c)
        {
            System.out.println("largest no is "+a);
        }
        else if (b>c)
        {
            System.out.println( "largest no is "+ b);
        }
        else
        {
            System.out.println("largest no is "+c);
        }
        // odd or even
        System.out.println("Enter no");
        Scanner al = new Scanner(System.in);
        int d = al.nextInt();

        if (d%2==0)
        {
            System.out.println(d+" is even");
        }
        else
        System.out.println(d+" is odd");


        //leap year or not

        System.out.println("Enter no");
        Scanner alt = new Scanner(System.in);
        int de = alt.nextInt();
        if ((de%4==0 && de%100!=0) || (de%400==0))
        {
            System.out.println(de + "is a leap year");
        }
        else
        System.out.println(de + "is not a leap year");*/



        // incometax calculator
        System.out.println("Enter salary");
        Scanner job = new Scanner(System.in);
        int salary = job.nextInt();
        if (salary>300000 && salary<700000)
        {
            int sal = (int) (salary*(10/100f));
            System.out.println("final salary is :"+ sal);
        }
        else if (salary>700000 && salary<1000000)
        {
            int sali = (int) (salary*(20/100f));
            System.out.println("final salary is :"+ sali);
        }
        else if (salary>1000000)
        {
            int salil = (int) (salary*(30/100f));
            System.out.println("final sal is: "+ salil);

        }
        else
        {
            int salili = (int) (salary*(100/100f));
            System.out.println("final sal is: "+ salili);


        }



    }
    
}
