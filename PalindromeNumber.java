﻿
public class PalindromeNumber {
    public static void main(String[] args) {

        int number = 154;
        int num = number;
        int count = 3;
        double result1 = 0;
        while (num > 0) {
            int rem = num % 10;
            double result = Math.pow(rem, count);
            result1 = (int) result1 + result; // reuslt1 = result
            num /= 10;
        }
        if (number == result1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a plaindrome");
        }

    }

}
