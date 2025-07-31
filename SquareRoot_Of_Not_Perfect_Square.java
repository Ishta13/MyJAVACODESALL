import java.util.*;
import java.lang.Math;

public class SquareRoot_Of_Not_Perfect_Square {
    public static int floorSqrt(int n) {
        int ans = (int) Math.sqrt(n); //typcasting to int to get the floor square root
        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
