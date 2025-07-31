public class RecursionLengthOfString {
    public static int length(String str, int i) {
        if (i == str.length()) {
            return 0;
        }
        return 1 + length(str, i + 1);   // 1 + sum taaki ek ek count add ho 
        //because baaki sb try 0 hi ans aa rha tha but 1 se add start hone pr length count ho rha
    }

    public static void main(String[] args) {
        String st = "hello";
        System.out.println("Total length of string: " + length(st, 0));
    }
}
