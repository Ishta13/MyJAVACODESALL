public class setIhBit {
    public static int ithBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2; // Position of the bit to set (0-based index)
        int result = ithBit(n, i);
        System.out.println("Original number: " + n);
        System.out.println("Setting the " + i + "th bit to 1.");
        System.out.println("Resulting number in decimal: " + result);
    }
}
