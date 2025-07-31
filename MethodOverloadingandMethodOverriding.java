public class MethodOverloading {
    public static void main(String[] args) {

        Overloading sc = new Overloading();
        sc.sum(1,2);
        sc.sum(1.2f,4.5f,5.6f);
        sc.sum(12,13,14);
    
    }
    
}
class Overloading{             //same func name but diff argument type
    void sum(int a,int b)
    {
        int suming=0;
        suming = a+b;
        System.out.println(suming);

    }
    void sum(float a,float b ,float c)
    {
        float summ = 0;
        summ = a+b+c;
        System.out.println(summ);

    }
    void sum(int a, int b,int c)
    {
        int summer = 0;
        summer = a+b+c;
        System.out.println(summer);

    }

}
