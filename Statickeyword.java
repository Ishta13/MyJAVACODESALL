public class Statickeyword {
    public static void main(String[] args) {
        //BankAccount bk = new BankAccount();
        //bk.bank_name("ICICI"); //can change output
       // BankAccount b = new BankAccount();
       // System.out.println(b.bank_name()); // error not true for output
        BankAccount bkn = new BankAccount();
        System.out.println(bkn.bank("RBI")); //can change output
        BankAccount qw = new BankAccount();
        qw.country_name ="India";
        BankAccount qwn = new BankAccount();
        System.out.println(qw.country_name);
       //even if not given name due to ****STATIC**** sbka same name ho gya
        


    }
}
class BankAccount
{
    static String bank_name; //static used for function
    int acno;
    static String country_name;
    String bank(String bank_name) //static can be changed if function
    {
        return bank_name;
    }

    
}
