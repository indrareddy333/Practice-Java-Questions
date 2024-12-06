// printing unicode lang which UTF_16 

import java.util.Scanner;

public class PlayWunicode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("नमस्ते" + name + "! ఎలా ఉన్నారు");
        scan.close();
    }
}