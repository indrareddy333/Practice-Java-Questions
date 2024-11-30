import java.util.Scanner;

public class ConFehtoCel {
    public static void main(String[] args) {
        // Convert the temperature from fahrenheit to celsius
        // Formula = (F - 32) X 5/9
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the fahrenheit(degree) to celsius = ");
        float fah = scan.nextInt();
        float Cel = (fah - 32) * 5 / 9;
        System.out.println("celsius = " + Cel + "°C");
        scan.close();
    }
}