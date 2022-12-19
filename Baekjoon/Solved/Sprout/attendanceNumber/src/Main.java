import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[31];

        for(int i = 1; i<29; i++){
            int n = scan.nextInt();
            arr[n] = 1;
        }
        for(int i = 1; i<arr.length;i++){
            if(arr[i] != 1){
                System.out.println(i);
            }
        }
    }
}