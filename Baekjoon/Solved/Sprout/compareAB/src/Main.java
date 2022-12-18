import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        scan.close();

        String result = (A>B) ? ">" : (A<B) ? "<": "==";

        System.out.println(result);
    }
}