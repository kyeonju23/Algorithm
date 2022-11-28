import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}