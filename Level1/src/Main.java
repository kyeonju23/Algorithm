import java.util.Scanner;

//BAEKJOON
//LEVEL1: 입출력과 사칙연산
//문제 번호: 2557, 1000, 1001, 10998, 1008
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        double C = scan.nextDouble();
        double D = scan.nextDouble();

        int result1 = A + B;
        int result2 = A - B ;
        int result3 = A * B;
        double result4 = C / D;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}