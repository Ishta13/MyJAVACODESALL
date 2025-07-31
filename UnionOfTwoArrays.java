
////////////O((n+m)^2) time complexity, O(n+m) space complexity
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        // Step 1: Create a new array big enough to hold all elements
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;

        // Step 2: Copy all elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            combined[index] = arr1[i];
            index++;
        }

        // Step 3: Copy all elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            combined[index] = arr2[i];
            index++;
        }

        // Step 4: Print only unique elements (no duplicates)
        System.out.println("Union of arrays:");
        for (int i = 0; i < combined.length; i++) {
            boolean isDuplicate = false; //rreset for every value to check each 

            // Check if combined[i] already appeared before
            for (int j = 0; j < i; j++) {
                if (combined[i] == combined[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(combined[i] + " ");
            }
        }
    }
}
