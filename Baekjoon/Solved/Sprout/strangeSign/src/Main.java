import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        System.out.println((A+B)*(A-B));
    }
}