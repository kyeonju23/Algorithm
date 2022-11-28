import java.util.Arrays;

//첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,
// 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
// 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1,2,3,4)));
        System.out.println(Arrays.toString(solution(9,2,1,3)));
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int num = num1 * num2; //분모
        int denum = (denum1 * num2) + (denum2 * num1); //분자

        int max = 1;

        for (int i = 1; i <= num && i <= denum; i++){
            if(num % i == 0 && denum % i == 0) max = i;
        }
        answer[0] = denum / max; //분자
        answer[1] = num / max; //분모

        return answer;
    }
}