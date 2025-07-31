public class OopsOverride {
    public static void main(String[] args) {
        Animal an = new Animal();
        System.out.println("Animal has " + an.legs(6) + " legs.");

        Deer de = new Deer(); // Using Animal reference for Deer object
        System.out.println("Deer has " + de.legs() + " legs.");
    }
}

class Animal {
    int legs(int a) {
        return a;
    }
}                              //*******************both parent and child class have same class toh jisse bhi call krenge uska ans print */

class Deer extends Animal {
    int legs() {
        return 4;
        
    }
}
