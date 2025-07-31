public class RecursionTowerOfHanoi {

    public static void tower(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from_rod + " to " + to_rod);
            return;
        }
        // Move n-1 disks from source to auxiliary rod
        tower(n - 1, from_rod, aux_rod, to_rod);
        // Move the nth disk from source to destination rod
        System.out.println("Move disk " + n + " from " + from_rod + " to " + to_rod);
        // Move n-1 disks from auxiliary rod to destination rod
        tower(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        tower(n, 'A', 'C', 'B'); // A, B, and C are the names of rods
    }
}
