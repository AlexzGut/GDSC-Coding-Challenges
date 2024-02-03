package Easy;

import java.util.Scanner;

class ValidParenthesesString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a parentheses string. Valid parentheses: - {} [] () -");
        System.out.print("> ");
        String parenthesesString = input.nextLine();

        boolean isValid = isExpressionValid(parenthesesString);
        System.out.println(isValid);
    }

    public static boolean isExpressionValid(String str) {

        StringBuilder tempStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ( tempStr.length() > 0 && (str.charAt(i) == ')' && tempStr.charAt(tempStr.length() - 1) == '(') ||
                    (str.charAt(i) == ']' && tempStr.charAt(tempStr.length() - 1) == '[') ||
                    (str.charAt(i) == '}' && tempStr.charAt(tempStr.length() - 1) == '{') ) {
                tempStr.deleteCharAt(tempStr.length() - 1);
            } else {
                tempStr.append(str.charAt(i));
            }
        }

        System.out.print("Is the parentheses string valid? ");
        return tempStr.length() == 0;
    }
}



