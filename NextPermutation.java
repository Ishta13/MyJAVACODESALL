import java.util.*;

public class NextPermutation {
    
    // Function to find the next greater permutation
    public static List<Integer> getNextPermutation(List<Integer> numbers) {
        int n = numbers.size();
        
        // Step 1: Find the first number from the end that is smaller than the next number
        int indexToSwap = -1;
        for (int i = n - 2; i >= 0; i--) { ////n-1 lete toh outofbounds
            if (numbers.get(i) < numbers.get(i + 1)) {
                indexToSwap = i;
                break;
            }
        }

        // If no such number is found, the list is in descending order (last permutation)
        if (indexToSwap == -1) {
            Collections.reverse(numbers); // Just reverse it to get the first (smallest) permutation
            return numbers;
        }

        // Step 2: Find the next bigger number to swap with
        for (int i = n - 1; i > indexToSwap; i--) {
            if (numbers.get(i) > numbers.get(indexToSwap)) {
                // Swap the numbers
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(indexToSwap));
                numbers.set(indexToSwap, temp);
                break;
            }
        }

        // Step 3: Reverse the part of the list after the swapped index
        List<Integer> partToReverse = numbers.subList(indexToSwap + 1, n);
        Collections.reverse(partToReverse);

        return numbers;
    }

    public static void main(String[] args) {
        // Input list
        List<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 5, 4, 3, 0, 0));

        // Get the next permutation
        List<Integer> result = getNextPermutation(input);

        // Print the result
        System.out.print("The next permutation is: ");
        System.out.println(result);
    }
}
