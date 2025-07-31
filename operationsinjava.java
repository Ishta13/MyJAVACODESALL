public class operationsinjava {
    public static void main(String[] args) {
        int a = 10;
        int b=a+=10;
        int c= b+=20;
        if ((a>b) && (c>b)){
            System.out.print("hello");
        }

        if((2+3>1) || (13<=1) )
        {
            System.out.println("jail");
        }
        System.out.println(c);
        System.out.println((2+3>1)&&(1+34>=35));



        int r = 123;
        int w = r++;
        System.out.println(w);
        int red = 134;
        int qwerty= ++red;
        System.out.println(qwerty);
        if (2%2<=1)
        {
            System.out.println("1233");

        }

        
        int z= 123;
        System.out.println(z*=10);
        System.out.println(z/=10);
        System.out.println(z+=12);
        System.out.println(z-=567);

    }
}
