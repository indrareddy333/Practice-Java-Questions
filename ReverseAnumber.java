import java.util.*;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long Reverse = 0;

        while (num > 0) {
            long rem = num % 10;
            num /= 10;
            Reverse = Reverse * 10 + rem;
        }
        System.out.println(Reverse);
        scan.close();
    }
}
