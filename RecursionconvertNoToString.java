public class RecursionconvertNoToString {

    public static String numberToString(int n) {
        if (n < 10) {
            return getDigitWord(n);
        }
        return numberToString(n / 10) + " " + getDigitWord(n % 10);   //iss case se ek ek no string name me covert without reversing no
        //yha pr left to right no concatenate ho rha isiliye no reverse nhi ho rha 
    }

    public static String getDigitWord(int digit) {
        switch (digit) {               //to assign string for each no
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "Invalid digit";
        }
    }

    public static void main(String[] args) {
        int n = 2019;
        String result = numberToString(n);
        System.out.println("Number to string conversion is: " + result);
    }
}
