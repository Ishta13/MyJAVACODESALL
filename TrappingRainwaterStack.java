import java.util.Stack;

public class TrappingRainwaterStack {
    public static int trapWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int trappedWater = 0;
        
        for (int i = 0; i < height.length; i++) {
            // Process all the elements that are smaller than the current height
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottom = stack.pop(); // Pop the top element
                
                // If the stack is empty after popping, there's no left boundary
                if (stack.isEmpty()) {
                    break;
                }
                
                int left = stack.peek(); // New top element is the left boundary
                int width = i - left - 1; // Distance between current element and left boundary
                int heightDifference = Math.min(height[left], height[i]) - height[bottom]; // Water height
                
                trappedWater += width * heightDifference; // Calculate trapped water
            }
            stack.push(i); // Push the current index onto the stack
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total Water Trapped: " + trapWater(arr)); // Output: 6
    }
}
