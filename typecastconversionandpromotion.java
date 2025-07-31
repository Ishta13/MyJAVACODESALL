import java.util.*;
public class typecastconversionandpromotion {
    public static void main(String[] args) {
        /*char ch= 'a';
        char ch2 = 'b';
        System.out.println((int)ch);
        System.out.println((int)ch2);
        int c = ch-ch2;
        System.out.println(c);          // java auto changes each byte,char,short to int

        //or
        char ch= 'a';
        char ch2 = 'b';
        System.out.println((int)ch);      
        System.out.println((int)ch2);
        System.out.println(ch-ch2);*/

            char a = 'd';
            char b = 'e';
            char c = 'f';
            char d = 'g';
            char e = 'h';
            System.out.println((int)a);
            System.out.println((int)b);       //kch nhi aa rha smjh for ex sirf (int)a akele kese likhe toh print krwado seedhe
            System.out.println((int)c);
            System.out.println((int)d);       //long float or double to their largest ones (double>long>float)
            System.out.println((int)e);
            System.out.println(a+b+c+d+e);


            int ae= 12;
            long be= 12345L;
            double ce= 123.34;
            float de = 12.34f;
            double ee= ae-(be*ce)+de;
            System.out.println(ee);
    
    }

}
