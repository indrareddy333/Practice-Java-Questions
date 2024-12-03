//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HCF_LCM_program {
    public static void main(String[] args) {
        int num1, num2, lcm, hcf;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        num1 = scan.nextInt();
        System.out.print("Enter the seconf number = ");
        num2 = scan.nextInt();
        if (num1 > num2) {
            lcm = num1;
        } else {
            lcm = num2;
        }
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("lcm is = " + lcm);
                break;
            }
            lcm++;
        }
        hcf = (num1 * num2) / lcm;
        System.out.println("HCF is = " + hcf);
        scan.close();

    }

}