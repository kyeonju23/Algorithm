import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextInt();
        long M = scan.nextInt();

        long result = Math.abs(N-M);

        System.out.println(result);
    }
}