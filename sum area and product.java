import java.util.*;
public class sum area and product {
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
        int r= n.nextInt();
        System.out.println("given radius is");
        System.out.println(r);


        int area = 3.14*r*r;
        System.out.println("radius of circle is");
        System.out.println(area);



        

    }

}
