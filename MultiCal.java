import java.util.Scanner;

public class MultiCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome Mutli Cal");
        System.out.print("Enter a first number = ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second number = ");
        int num2 = scan.nextInt();
        System.out.print("Enter a function you want to perform calculation (type : add,sub,multi,div) = ");
        String fun = scan.next();
        if (fun.equals("add")) {
            int result = num1 + num2;
            System.out.println("Output = " + result);
        } else if (fun.equals("sub")) {
            int result = num1 - num2;
            System.out.println("Output = " + result);
        } else if (fun.equals("multi")) {
            int result = num1 * num2;
            System.out.println("Output = " + result);
        } else if (fun.equals("div")) {
            int result = num1 / num2;
            System.out.println("Output = " + result);
        } else {
            System.err.println("Something went wrong ! Try Again :)");
        }

    }
}