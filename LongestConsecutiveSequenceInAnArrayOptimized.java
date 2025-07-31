import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequenceInAnArrayOptimized {  
    public static int longestcons(int a[]) {
        int n = a.length;
        if(n == 0) return 0; // agar array khali ho to return 0

        int longest = 1; // kam se kam ek number hoga to length 1 to hamesha hogi
        Set<Integer> set = new HashSet<>(); // HashSet use kiya hai fast lookup ke liye

        // Step 1: Array ke saare elements ko set me daal do
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]); // duplicate automatically remove ho jaayenge
        }

        // Step 2: Iterator banaya set ke elements traverse karne ke liye
        Iterator<Integer> iterator = set.iterator();

        // Step 3: Har element ke liye check karo kya yeh sequence ka starting number ho sakta hai
        while(iterator.hasNext()) {
            int it = iterator.next(); // current number

            // agar previous number (it - 1) set me nahi hai to yeh sequence ka start ho sakta hai
            if (!set.contains(it - 1)) {
                int count = 1; // sequence ka length
                int x = it;

                // jab tak next number milta rahe tab tak count badhao
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }

                // maximum length store karo
                if (count > longest) {
                    longest = count;
                }
            }
        }

        return longest; // final answer return karo
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 1, 2, 3, 4};
        int ans = longestcons(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
