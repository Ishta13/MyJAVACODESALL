public class OopsaccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();              // class subject = new class
        s.name = "Ishta";                       // object.name
        System.out.println(s.name);             // sysout(object.name)
        s.marks = 78;                           // always use properties (name,properties)
        System.out.println(s.marks);
        Bank_account bk = new Bank_account();
        bk.setPass("!@1234qwe");     // setPass can't be shown as prvate passwd
        //System.out.println(bk.setPass);  //not visible
        bk.accountNo= 1248060;
        System.out.println(bk.accountNo);

    }


    
}
/**
 * InnerOopsaccessModifiers
 */
class Student {                                      //always write below
    String name;
    int marks;
    void setName (String newname)                      //can't use pub static void because upr ke name can't be assigned here
    {
        name= newname;

    }

     void mark (int mathsmarks)      //can't use pub static void because upr ke marks can't be assigned here
    {
        marks = mathsmarks;

    }

    
}
class Bank_account 
{
    public int accountNo;
    private String passwd;                      // use getters and setters for changing and getting private things

     void setPass (String newpwd)
    {
        passwd = newpwd;           //assigning the values to change the value using functions
    }
    void setAc (int newac)
    {
        accountNo = newac;

    }                      ///////////// /////////////////////////don't use neeche public in func if using private upr and also private without usng in func set is incorrect
}