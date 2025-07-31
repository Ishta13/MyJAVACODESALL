public class mathfunctions {
    public static void main(String[] args) {
        //int min = Math.min(10, 20);
        System.out.println("Math.min(10, 20): "+Math.min(10, 20)); // only 2 no allowed in inbuilt function

                                     // both these methods can work either take a func directly to print or first store it's value and print it's value


        // Math.max()
        int max = Math.max(10, 20);
        System.out.println("Math.max(10, 20): " + max);

        // Math.sqrt()
        double sqrt = Math.sqrt(25);
        System.out.println("Math.sqrt(25): " + sqrt);

        // Math.pow()
        double power = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3): " + power); // first base then power

        // Math.abs()
        int abs = Math.abs(-10);
        System.out.println("Math.abs(-10): " + abs); // to find absolutte value of a no
    }
}
