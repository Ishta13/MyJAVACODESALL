public class ClassSuperKeyword {
    public static void main(String[] args) {
        Monkey mn = new Monkey();
    }
}
class Animal
{
   Animal()
    {
        System.out.println("animal is called");
    }
}
class Monkey extends Animal
{
    Monkey()
    {
    super();
    System.out.println("monkey is called");
    }
}