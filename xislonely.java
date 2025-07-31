import java.util.ArrayList;

public class xislonely {
    public static void xislonelychecking(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            boolean isLonely = true;

            // Check previous element if it exists
            if (i > 0 && (arr.get(i - 1) == current - 1 || arr.get(i - 1) == current + 1)) { //agr 0 se bda indx hoga tb
                isLonely = false;
            }

            // Check next element if it exists
            if (i < arr.size() - 1 && (arr.get(i + 1) == current - 1 || arr.get(i + 1) == current + 1)) { //agr last indx size se chota ho toh
                isLonely = false;
            }
           
            if (isLonely) {
                System.out.println(current);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(6);
        arr.add(5);
        arr.add(8);
        arr.add(10);
        xislonelychecking(arr);
    }
}
