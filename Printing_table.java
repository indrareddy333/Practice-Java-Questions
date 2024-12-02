//Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Printing_table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number you want to print whole multiplication table = ");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
            scan.close();
        }
    }
}