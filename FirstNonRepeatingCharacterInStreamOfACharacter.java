import java.util.*;

public class FirstNonRepeatingCharacterInStreamOfACharacter {

    // Function jo stream me se pehla non-repeating character print karegi step by step
    public static void NonRepeating(String str) {
        int freq[] = new int[26]; // 'a' to 'z' ke characters ke liye frequency array
        Queue<Character> q = new LinkedList<>(); // Queue banayi taaki order maintain rahe

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // current character nikaala
            //////str isiliye liya kyuki String str lo acc to name if st toh st.charAt lo
            q.add(ch); // queue me add kiya
            freq[ch - 'a']++; // us character ka freq +1 kiya

            // Jab tak queue ka front (peek) repeating hai, use remove karte jao
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) { // queue ke front se character ki frequency check karte hain
                q.remove();
            }

            // Agar queue empty ho gayi toh koi non-repeating char nahi hai
            if (q.isEmpty()) {
                System.out.print("-1 "); // space ke saath print kar rahe
            } else {
                System.out.print(q.peek() + " "); // abhi tak ka first non-repeating character print karo
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String chara = "aabbcdwhdbwejhhz"; // input stream
        NonRepeating(chara); // function call
    }
}
