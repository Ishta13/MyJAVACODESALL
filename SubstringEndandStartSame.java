public class SubstringEndandStartSame {

    public static int countSubstrings(String s, char c) {
        int count = 0;

        // Loop through the string to find all occurrences of 'c'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;  // Increment the count of 'c' found so far
            }
        }

        // Calculate number of substrings that start and end with 'c'
        // If 'c' appears 'k' times, the number of such substrings is (k * (k + 1)) / 2
        return (count * (count + 1)) / 2;
    }

    public static void main(String[] args) {
        String s = "abaada";
        System.out.println("Same letter start and end substring count: " + countSubstrings(s, 'a'));
    }
}
