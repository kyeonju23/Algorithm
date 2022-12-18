import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // leap year: 4의 배수이면서 100의 배수가 아닐 때 or 400의 배수일 경우
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        //방법1
        int result = (year % 4 == 0 && year % 100 != 0) ? 1 : (year % 400 == 0) ? 1 : 0;

        //방법2
//        int result = 0;
//        if(year % 4 == 0 && year % 100 != 0){
//            result = 1;
//        } else if (year % 400 == 0) {
//            result = 1;
//        }else result = 0;

        System.out.println(result);
    }
}
