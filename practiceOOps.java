public class practiceOOPs {
    public static void main(String[] args) {
        Animal ant = new Animal();
        ant.legs=22;
        System.out.println(ant.legs);
        ant.name="qwerty";
        System.out.println(ant.name);
        
    }
    
}
 class Animal
{
    String name;
    int no;
    int legs;
}
