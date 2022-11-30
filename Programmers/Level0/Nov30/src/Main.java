import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(insertDash("454793"));
    }
    //배열을 입력받아 차례대로 배열의 첫 요소와 마지막 요소를 키와 값으로 하는 HashMap을 리턴
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        int len = arr.length;

        if(len == 0) {
            return null;
        }

        HashMap<String, String> sol = new HashMap<>();
        sol.put(arr[0], arr[len - 1]);
        return sol;
    }
    //연이율을 입력받아 원금이 2배 이상이 될 때까지 걸리는 시간(년)을 리턴
    public int computeWhenDouble(double interestRate) {
        // TODO:
        //연이율: interestRate
        //원금이 2배 이상
        //원금 일반식: ( 원금 + (연이율 / 100) )^year(연수)

        double money = 1+interestRate / 100;
        double rate = 1;
        int years = 0;

        while(rate<2){
            rate = rate * money;
            years++;

        }
        return years;
    }
    //수를 입력받아 2의 거듭제곱인지 여부를 리턴
    public boolean powerOfTwo(long num) {
        if (num == 1) {
            return true;
        }

        if (num % 2 != 0) {
            return false;
        }

        long powered = 2;
        while (powered < num) {
            powered = powered * 2;
        }

        return powered == num;
    }
    //문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열을 리턴
    public String firstCharacter(String str) {
        if (str.length() == 0) return "";

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result = result + words[i].charAt(0);
        }

        return result;
    }
    //문자열을 입력받아 순서가 뒤집힌 문자열을 리턴
    public String firstReverse(String str) {
        StringBuilder restr = new StringBuilder(str);

        return restr.reverse().toString();
    }
    //문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을 리턴
    public String letterCapitalize(String str) {
        if(str.length() == 0) return "";

        String[] words = str.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()) {
                words[i] = words[i];
            } else {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }

        result = String.join(" ", words);
        return result;
    }
    //2차원 배열(배열을 요소로 갖는 배열)을 입력받아 각 배열을 이용해 만든 HashMap을 리턴s
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> result = new HashMap<>();
        if(arr.length == 0) return result;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0) {
                if(!result.containsKey(arr[i][0])) {
                    result.put(arr[i][0], arr[i][1]);
                }
            }
        }
        return result;
    }
    //문자열을 입력받아 해당 문자열에 등장하는 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴
    public String convertDoubleSpaceToSingle(String str) {
        String[] words = str.split("  ");
        return String.join(" ", words);
    }
    //문자열을 입력받아 문자열 내에 아래 중 하나가 존재하는지 여부를 리턴해야 합니다.

    //'a'로 시작해서 'b'로 끝나는 길이 5의 문자열
    //'b'로 시작해서 'a'로 끝나는 길이 5의 문자열
    public boolean ABCheck(String str) {
        if(str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }
        return false;
    }
    //문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴
    public static String insertDash(String str) {
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0);
        for(int i = 1; i<str.length(); i++) {
            int pre = Character.getNumericValue(str.charAt(i-1));
            int cur = Character.getNumericValue(str.charAt(i));
            if ((pre % 2 == 1) && (cur % 2 == 1)) {
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}