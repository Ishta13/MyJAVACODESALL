public class PriorityClassses {
    public static void main(String[] args) {
        Pug pg = new Pug();
    }
}
class Animal{
    Animal()
    {
        System.out.println("animal is called");
    }
}
class Dog extends Animal
{
    Dog()
    {
        System.out.println("dog is called ");
    }
}
class Pug extends Dog{
        Pug()
        {
            System.out.println("pug is called");

        }
    }

