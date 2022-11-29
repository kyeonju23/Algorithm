public class Main {
    public static void main(String[] args) {
        String str = "bread";

        System.out.println("기존 문자열: "+str);
        System.out.println("문자열 뒤집기: "+reverseString(str));
        System.out.println("문자 반복하기: "+reString(str, 3));
    }
    public static String reverseString(String my_string) { //문자열 뒤집기
        String answer = "";

        for(int i = my_string.length() -1; i >= 0; i--){
            answer += my_string.charAt(i);
        }

        return answer;
    }
    public static String reString(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        int count = 0;

        for(int i = 0; i<= len-1; i++){
            for(int j = 1; j <= n; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

}