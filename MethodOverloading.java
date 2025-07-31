public class MethodOverloading {
    public static void main(String[] args) {

        Overloading sc = new Overloading();
        sc.sum(1,2);
        sc.sum(1.2f,4.5f,5.6f,3.4f);    // or sc.sum((float)1.2,(float)4.5,(float)5.6)
        sc.sum(12,13,14);
        System.out.println(sc.sum(1.2f,1.3f,1.4f));
    
    }
    
}
class Overloading{             //same func name but diff argument type
    void sum(int a,int b)
    {
        int suming=0;
        suming = a+b;
        System.out.println(suming);

    }
    void sum(float d,float e,float f,float g)  // can't take same func name with same no of var or same name of variable
    {
        float sum =0;
        sum = d+e+f+g;
        System.out.println(sum);   //example float and void sum 
        


    }
   float sum(float a,float b ,float c)     // take float af func data type otherwise (possible lossy conversion from float to int)
    {
        float summ = 0;
        summ = a+b+c;
        return summ;

    }
    void sum(int a, int b,int c)
    {
        int summer = 0;
        summer = a+b+c;
        System.out.println(summer);

    }

}
