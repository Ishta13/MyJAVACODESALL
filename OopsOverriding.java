public class OopsOverriding {
    public static void main(String[] args) {
        Deer an = new Deer();        // create class
        an.legs();                 //as deer is called so deer's input only gives output
    }
}
class Animal
{
    void legs()
    {
        System.out.println("there can be many legs");
    }
}
class Deer extends Animal 
{
    void legs()
    {
        System.out.println("there are 4 legs");
    }
}
