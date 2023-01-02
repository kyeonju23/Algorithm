import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        int[][] result = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                A[i][j] = scan.nextByte();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                B[i][j] = scan.nextByte();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                result[i][j] = A[i][j] + B[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}