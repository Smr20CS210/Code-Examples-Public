package midterm1;

public class E02String2 {
    public static void main(String[] args) {
        String list_str = "1.3 2.8 3.9 4.2 5.3";
        System.out.println(sumup(list_str));
    }

    // Given a string of space-separated numbers,
    // read the numbers in as strings and return their sum.
    public static double sumup(String list_str) {
        String[] num_strs = list_str.split(" ");
        double sum = 0;
        for (String num_str : num_strs) {
            double num = Double.valueOf(num_str);
            sum = sum + num;
        }
        return sum;
    }

}
