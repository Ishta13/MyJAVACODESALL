public class OOpsGettersandSetters {
    public static void main(String[] args) {
        Animal aa = new Animal();               
        aa.setName("Dog");                   //give input
        //give output
        System.out.println(aa.getName());
        aa.setLegs(12);                //give input
        System.out.println(aa.getLegs());        //give output
        aa.setName("tiger");
        System.out.println(aa.getName());
        aa.setLegs(34);
        System.out.println(aa.getLegs());
        
    }
   


    
}
class Animal
{
    private String animal_name;
    private int legs;                     //return prop only and also give sysout me ye wale hi

    String getName ()
    {
        return this.animal_name;          // use for getter setter and constructors (IMPORTANT)
    }
    void setName(String animal_name )           // modify (give new) name
    {
        this.animal_name = animal_name;

    }
    int getLegs()
    {
        return this.legs;               // return used to give output
    }

    void setLegs(int new_legs)
    {
        legs = new_legs;           // used to take input

    }



}
