public class ConvertNoToString {
    public static String numberToString(int n) {
        StringBuilder sc = new StringBuilder();
        if (n == 0) {
            return "zero";
        }
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            String word = "";
            if (r == 0) {
                word = "zero";
            } else if (r == 1) {
                word = "one";
            } else if (r == 2) {
                word = "two";
            } else if (r == 3) {
                word = "three";
            } else if (r == 4) {
                word = "four";
            } else if (r == 5) {
                word = "five";
            } else if (r == 6) {
                word = "six";
            } else if (r == 7) {
                word = "seven";
            } else if (r == 8) {
                word = "eight";
            } else if (r == 9) {
                word = "nine";
            }
            sc.insert(0, word + " ");
        }
        return sc.toString().trim();
    }

    public static void main(String[] args) {
        int n = 2019;
        System.out.println("Number to string conversion is: " + numberToString(n));
    }
}
