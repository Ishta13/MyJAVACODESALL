public class practiceSessionAfter3rdMse1 {
    public static void main(String[] args) {
        int j = 5;

        // Using pre-increment: ++j
        int preIncrement = ++j;
        System.out.println("Using pre-increment: ++j");
        System.out.println("Value of preIncrement: " + preIncrement); // 6
        System.out.println("Value of j after pre-increment: " + j);   // 6

        // Resetting j to 5 for the next example
        j = 5;

        // Using post-increment: j++
        int postIncrement = j++;
        System.out.println("\nUsing post-increment: j++");
        System.out.println("Value of postIncrement: " + postIncrement); // 5
        System.out.println("Value of j after post-increment: " + j);   // 6
        String str = "rad";
        int n;
        String newstr = "";
        n= str.length();
        for(int i=0;i<str.length();i++)
        {
            newstr+=str.charAt(n-1-i);
        } 
        if (str.equals(newstr))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.err.println("not palindrome");
        }
        String stri = "qwerty";
        String st = "QWERTY";
        int result = stri.compareToIgnoreCase(st);
        System.out.println(result);
        int i = 1;
        int no=8;
        int bit = 1<<i;
         System.out.println(bit|no);
    }
} 
