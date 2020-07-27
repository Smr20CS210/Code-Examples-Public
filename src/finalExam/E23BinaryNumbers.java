package finalExam;

public class E23BinaryNumbers {

    public static void main(String[] args) {
        printBinary(3);
    }

    public static void printBinary(int bits) {
        binaryHelper(bits, "");
    }

    public static void binaryHelper(int bits, String soFar) {
        // base case - bits = 0
        if (bits == 0) {
            System.out.println(soFar);
        } else {
            // Two decisions, 0 or 1
            // choose 0
            // explore
            // unchoose 0
            binaryHelper(bits - 1, soFar + "0");

            // Unchoose - no need to do anything since,
            // we made not permanent change to our problem parameters

            // choose 1
            // explore
            // unchoose 1
            binaryHelper(bits - 1, soFar + "1");
        }
    }
}
