package midterm2;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

import java.util.Scanner;

public class E17CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radius = Double.valueOf(scanner.nextLine());

        Double area = PI * pow(radius, 2);

        System.out.println(area);
    }

}
