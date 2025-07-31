import java.util.ArrayList;

public class BeautifulArray {

    // This method generates a beautiful array for the given size 'n'
    public static ArrayList<Integer> beautifulArray(int n) { //kyuki n as input jaayga aur array generate hoga
        ArrayList<Integer> ans = new ArrayList<>(); // Initialize the array list to store the beautiful array
        ans.add(1); // Start with the initial element 1

        // Loop to build the beautiful array step-by-step
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>(); // Temporary list to hold the current step elements

            // Generate even elements and add them to the temp list
            for (int j = 0; j < ans.size(); j++) {
                int e = ans.get(j);
                if (2 * e <= n){ 
                temp.add(e * 2);
                }
            }

            // Generate odd elements and add them to the temp list
            for (int j = 0; j < ans.size(); j++) {
                int e = ans.get(j);
                if (2 * e - 1 <= n){
                 temp.add(e * 2 - 1);
                }
            }

            // Update the ans list with the current step elements
            ans = temp;
        }

        return ans; // Return the resulting beautiful array
    }

    public static void main(String[] args) {
        int n = 5; // Example input size
        ArrayList<Integer> result = beautifulArray(n); // Generate the beautiful array for size n
        System.out.println(result); // Output the resulting beautiful array
    }
}
