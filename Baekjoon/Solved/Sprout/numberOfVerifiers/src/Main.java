import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int result = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt();
            result += arr[i] * arr[i];
        }
        result = result % 10;
        System.out.println(result);
    }
}