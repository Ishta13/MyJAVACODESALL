import java.util.*;
public class practicetypecastingandinput {
    public static void main(String[] args) {
        /*System.out.println("Enter no");
        Scanner ass = new Scanner(System.in);
        int a = ass.nextInt();
        System.out.println("provided no is");
        System.out.println(a);


        System.out.println("Enter no");
        Scanner assi = new Scanner(System.in);
        int ab = assi.nextInt();
        System.out.println("provided no is");
        System.out.println(ab);


        System.out.println("Enter no");
        Scanner assin = new Scanner(System.in);    
        int abc = assin.nextInt();
        System.out.println("provided no is");
        System.out.println(abc);
        int avg = (a+ab+abc)/3;
        System.out.println("avg is");
        System.out.println(avg);                    // avg of 3 no is 

        int area = a*a;
        System.out.println("area is" + area);*/      // area of square
         

        // price and gst of some items
        System.out.println("Enter price ");
        Scanner jeff = new Scanner(System.in);
        float qwerty = jeff.nextFloat();
        System.out.println("the price is");
        System.out.println(qwerty);


        System.out.println("Enter price ");
        Scanner jeffi = new Scanner(System.in);
        float qwertyi = jeffi.nextFloat();
        System.out.println("the price is");
        System.out.println(qwertyi);



        System.out.println("Enter price ");
        Scanner jeffin = new Scanner(System.in);
        float qwertyin = jeffin.nextFloat();
        System.out.println("the price is");
        System.out.println(qwertyin);


        float all = ((18/100f)*qwertyin) + qwertyin;
        float red = ((18/100f)*qwertyi) + qwertyi;
        float cat = ((18/100f)*qwerty) + qwerty;

        System.out.println("after adding gst final price :"+ all);
        System.out.println("after adding gst final price :"+ red);               // or take full total in advance aur fir saath me uska gst nikaalo rather than alg alg 
        System.out.println("after adding gst final price :"+ cat);


        float totalbill = all + red + cat;
        System.out.println("the totalbill is :" + totalbill);


       
    }
    
}
