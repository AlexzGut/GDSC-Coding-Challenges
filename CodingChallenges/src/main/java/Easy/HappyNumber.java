package Easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.printf("The number %d %s a Happy Number", number, isHappyNumber(number) ? "is" : "is not");
    }

    public static List<Integer> extractDigits(int number) {
        int remainder;
        List<Integer> digits = new ArrayList<>();

        do {
            remainder = number % 10;
            digits.add(0, remainder);
            number = number / 10;
        } while (number != 0);

        return digits;
    }

    public static int sumOfSquares(List<Integer> list) {
        int total = 0;
        for (Integer item : list) {
            total += (Math.pow(item, 2));
        }
        return total;
    }

    public static boolean isHappyNumber(int number) {
        List<Integer> digits;
        int count = 0;

        while (number != 1) {
            digits = extractDigits(number);
            number = sumOfSquares(digits);
            count++;
            if (count > 100000) break;
        }

        return number == 1;
    }

}
