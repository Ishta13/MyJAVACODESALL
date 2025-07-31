import java.util.*;
public class sumareaandproduct {
   public static void main(String[] args){
        System.out.println("Enter 1st no");
        Scanner neq= new Scanner(System.in);
        int a= neq.nextInt();
        System.out.println("given no is");
        System.out.println(a);


        System.out.println("Enter 2nd no");
        Scanner ne= new Scanner(System.in);
        int b= ne.nextInt();
        System.out.println("given no is");
        System.out.println(b);

        int sum = a+b;
        int mul = a*b;
        System.out.println("sum is");
        System.out.println(sum);
        System.out.println("product is");
        System.out.println(mul);

        System.out.println("Enter radius");
        Scanner n= new Scanner(System.in);
        float r= n.nextFloat();
        System.out.println("given radius is");
        System.out.println(r);


        float area = 3.14f*r*r;         //without f java auto takes double so use f
        System.out.println("area of circle is");
        System.out.println(area);

        



        

    }

}



    

