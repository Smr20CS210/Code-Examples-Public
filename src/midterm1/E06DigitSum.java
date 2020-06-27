package midterm1;

public class E06DigitSum {

    public static void main(String[] args) {
        System.out.println(digitSum(1729));
        System.out.println(digitSum(-1892));
    }

    /*
     * Takes in an integer and prints the sum of the
     * individual digits. Should work for positive or
     * negative values.
     */
    public static int digitSum(int n) {
        System.out.println(n);
        if (n < 0) {
            return digitSum(-n);
        } else if (n < 10) {
            return n;
        }
        return n % 10 + digitSum(n / 10);
    }

}
