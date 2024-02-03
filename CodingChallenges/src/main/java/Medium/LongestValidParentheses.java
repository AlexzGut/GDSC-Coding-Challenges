package Medium;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class LongestValidParentheses {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringBuilder tempStr = new StringBuilder();
        String parentheses;
        int count = 0;

        System.out.print("Enter a parentheses string. Valid parentheses: - () -");
        parentheses = input.nextLine();

        for (int i = 0; i < parentheses.length(); i++) {
            /* conditions
                1. temporary string can not be empty
                2. last character of temporary string must be '('
                3. current character of the string containing the parentheses must be ')'
                If all three conditions are met the last character in the temporary string will be deleted,
                Otherwise the current character will be appended to the temporary string.
             */
            if (tempStr.length() > 0 && tempStr.charAt(tempStr.length() - 1) == '(' && parentheses.charAt(i) == ')') {
                tempStr.deleteCharAt(tempStr.length() - 1);
                count += 2;
            } else {
                tempStr.append(parentheses.charAt(i));
            }
        }
        System.out.printf("The length of the longest valid parentheses substring: %d", count);
    }
}
