import java.util.HashSet;
import java.util.Iterator;
public class UnionOfTwoArraysOptimized {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        //You can't use indexing in a HashSet (no indexes).

         //So, we use an Iterator to go through every element in the set.

        // Step 1: Create a HashSet to store unique elements
        HashSet<Integer> unionSet = new HashSet<>();

        // Step 2: Add all elements of arr1 using normal for loop
        for (int i = 0; i < arr1.length; i++) {
            unionSet.add(arr1[i]);
        }

        // Step 3: Add all elements of arr2 using normal for loop
        for (int i = 0; i < arr2.length; i++) {
            unionSet.add(arr2[i]);
        }

        // Step 4: Print the union set using Iterator (expanded form)
        System.out.println("Union of arrays:");
        Iterator<Integer> it = unionSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
