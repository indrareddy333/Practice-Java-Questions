import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while (true) {
            String sttr = "WELCOM THE CALCULATOR";
            System.out.println(sttr);
            System.out.print("Enter the operation (+) (-) (x) (/) (%) (exit:x | X) = ");
            char op = scan.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op == 'x' || op == 'X') {
                if (op == '+') {
                    System.out.println("Enter two digit numbers = ");
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    result = num1 + num2;
                }
                if (op == '-') {
                    System.out.println("Enter two digit numbers = ");
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    result = num1 - num2;
                }
                if (op == '*') {
                    System.out.println("Enter two digit numbers = ");
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    result = num1 * num2;
                }
                if (op == '/') {
                    System.out.println("Enter two digit numbers = ");
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    result = num1 / num2;
                }
                if (op == '%') {
                    System.out.println("Enter two digit numbers = ");
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    result = num1 % num2;
                }
                if (op == 'x' || op == 'X') {
                    System.out.println("Calculator Closed");
                    break;
                }
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Result = " + result);
            System.out.println();
        }
        scan.close();

    }

}
