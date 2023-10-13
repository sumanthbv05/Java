////2. Enter Roman Number as input and convert it to integer. (ex IX = 9)

////Solution:

import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char romanChar = romanNumeral.charAt(i);
            int curValue = 0;

            if (romanChar == 'I') {
                curValue = 1;
            } else if (romanChar == 'V') {
                curValue = 5;
            } else if (romanChar == 'X') {
                curValue = 10;
            } else if (romanChar == 'L') {
                curValue = 50;
            } else if (romanChar == 'C') {
                curValue = 100;
            } else if (romanChar == 'D') {
                curValue = 500;
            } else if (romanChar == 'M') {
                curValue = 1000;
            } else {
                System.out.println("Invalid Roman Numeral");
                return;
            }

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        System.out.println("Integer representation: " + result);
    }

}
