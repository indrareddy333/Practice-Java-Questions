public class PostPreIncrement {
    public static void main(String[] args) {
        int num = 1;
        int result = ++num;
        int num2 = 1;
        int result2 = num2++;
        System.out.println("post = " + result + " pre = " + result2);

    }

}