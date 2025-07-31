public class abstractClasses {
    public static void main(String[] args) {
        Peacock ps = new Peacock();
        ps.newColor("red");
        System.out.println(ps.color);     // func called and changed value
        ps.eats();             //func called 
        System.out.println(ps.size); //constructor called 
        ps.changeSize(123); //whennchange size then upr wala 0 ho gya
        System.out.println(ps.size); // new size 

    }

    
}
abstract class Animal{
    //can use constructors also
    int size;
    Animal()
    {
       this.size = 12;       //or size = "12" it can be implemented to all subclasses if called but can't call animal because abstract(only idea)
    }
    void walk()
    {
        System.out.println("animal walks while aquatic animal swims");
    }
    abstract void eats();     //is only idea
}
class Peacock extends Animal
{
    int size;
    String color;
    void newColor (String color)
    {
        this.color = color;                 //calling normal func in class
    }
    void eats()         // abstract calls 
    {
        System.out.println("eats insects");   //implementation of abstract void eats()
    }
    void changeSize(int size)
    {
        this.size = size;
    }
}
