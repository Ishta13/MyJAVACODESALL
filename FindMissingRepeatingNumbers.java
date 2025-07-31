import java.util.*;

public class FindMissingRepeatingNumbers {

    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        int xr = 0;

        // ✅ Step 1: Array + natural numbers ka XOR le lo
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];      // array ka element
            xr = xr ^ (i + 1);   // 1 to n tak number           // size ka xor
        }
        
        // ✅ Step 2: Find rightmost set bit (jahan repeat aur missing differ karte honge)
        int number = (xr & ~(xr - 1));  // magic bit extractor
        //xr = missing_number ^ repeating_number

        // ✅ Step 3: Divide numbers into 2 groups (based on set bit)
        int zero = 0, one = 0;

        // array ke elements ko group karo
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            } else {
                zero = zero ^ a[i];
            }
        }
        //size ko bhi group karo
        // 1 to n numbers ko bhi same way group karo
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one = one ^ i;
            } else {
                zero = zero ^ i;
            }
        }

        // ✅ Step 4: Identify kaun missing hai aur kaun repeat
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++; /* Agar zero 2 baar aaya hai, toh clearly:

                                        ✅ zero = repeating number

                                              ✅ one = missing number */
        }

        // zero ya one me se koi ek repeat hoga, dusra missing
        if (cnt == 2) return new int[] {zero, one};  // zero is repeating
        else return new int[] {one, zero};           // one is repeating
        /* ❗Else (matlab zero sirf 1 baar aaya, toh):

                  ✅ one = repeating number

                  ✅ zero = missing number */
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};  // 5 is repeating, 8 is missing
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "}");
    }
}
