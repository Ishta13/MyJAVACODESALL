public class SortArrayOf0s1s2s {
    public static void sortArray(int[] arr) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        // Step 1: Count the number of 0s, 1s, and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 1) {
                ones++;
            } else if (arr[i] == 2) {
                twos++;
            }
        }

        // Step 2: Fill the array in order — first 0s, then 1s, then 2s
        int index = 0;

        for (int i = 0; i < zeros; i++) { //jbtk zero khtm 
           // nhi ho jaate fill at starting index and saath hi me index bhi badhaate chlo
            arr[index] = 0;
            index++;
        }

        for (int i = 0; i < ones; i++) { //jbtk 1 khtm 
            // nhi ho jaate fill at middle index and saath hi me index bhi badhaate chlo
            arr[index] = 1;
            index++;
        }

        for (int i = 0; i < twos; i++) {
            arr[index] = 2; //jbtk zero khtm 
            // nhi ho jaate fill at last index and saath hi me index bhi badhaate chlo
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1, 2};

        sortArray(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
