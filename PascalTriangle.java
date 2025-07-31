
import java.util.*;

public class PascalTriangle {
    public static List<Integer> generateRow(int row) {
        long ans = 1; //to store the binomial coefficient value
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element

        //calculate the rest of the elements:
        for (int col = 1; col < row; col++) { //col starts from 1 because 0th element is already added
            //binomial coefficient formula:
            //C(row, col) = row! / (col! * (row - col)!)
            /*C(4, 0) = 1 ->>>> ->>>>>> ans = 1
            C(4, 1) = C(4, 0) * (4 - 0) / 1 = 1 * 4 / 1 = 4
            C(4, 2) = C(4, 1) * (4 - 1) / 2 = 4 * 3 / 2 = 6
            C(4, 3) = C(4, 2) * (4 - 2) / 3 = 6 * 2 / 3 = 4
            C(4, 4) = C(4, 3) * (4 - 3) / 4 = 4 * 1 / 4 = 1
            */
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans); //typecasting long to int
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n) { /*We need one list per row of Pascal’s Triangle.
So, a list of lists is needed to store the entire triangle. */
        List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= n; row++) { //row starts from 1 to n
            //generate each row: for pascal's triangle
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (int i = 0; i < ans.size(); i++) { //loop through each row of pascal's triangle
    List<Integer> it = ans.get(i); //get the ith row of pascal's triangle
    for (int j = 0; j < it.size(); j++) {
        int ele = it.get(j);
        System.out.print(ele + " ");
    }
    System.out.println();
}
        System.out.println("The Pascal's Triangle with " + n + " rows is generated.");
    }
}
