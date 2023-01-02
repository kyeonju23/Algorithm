import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int v = scan.nextInt();

        for(int i = 0; i<n; i++){
            if(arr[i] == v){
                count++;
            }
        }

        System.out.println(count);
    }
}