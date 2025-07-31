import java.util.PriorityQueue;

public class tworopesisequaltothesumoftheirlengths {

    // Ye function minimum cost calculate karega saari ropes ko connect karne ke liye
    public static int rope(int arr[], int n) {
        // ✅ Step 1: Min-Heap (PriorityQueue) banate hain taaki smallest rope hamesha top pe ho
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // ✅ Step 2: Saare rope lengths ko heap me daal do
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]); // rope ko add kiya queue me
        }

        int res = 0; // ✅ Total cost yahan store hogi

        // ✅ Jab tak queue me ek se zyada ropes bachi hain
        while (pq.size() > 1) {
            // ✅ Sabse choti 2 ropes nikaalo
            int first = pq.remove();  // sabse choti rope
            int second = pq.remove(); // doosri sabse choti

            // ✅ Dono ropes ko jod kar cost me add karo
            res += first + second;

            // ✅ Nayi rope (first + second) wapas queue me daal do
            pq.add(first + second);
        }

        // ✅ Jab ek hi rope bacha hai, total cost return karo
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6}; // Sample rope lengths
        int ropesum = rope(arr, 4); // Function call kiya
        System.out.println("min length rope total sum: "+ropesum); // Final answer print kiya
    }
}
