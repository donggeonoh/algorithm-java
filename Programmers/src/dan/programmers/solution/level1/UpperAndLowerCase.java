package dan.programmers.solution.level1;

/*
 * Date : 2020-01-10
 * Auth : Oh-Dong-geon
 * Description : 띄어쓰기로 단어가 구분되고, 각 단어마다 홀수 번째 문자는 대문자, 짝수번째 문자는 소문자로 바꾸는 문제입니다.
 */


public class UpperAndLowerCase {
    public String solution(String s) {
        String answer = "";
        int index = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += s.charAt(i);
                index = 0;
                continue;
            }

            int temp = index % 2;

            if(temp == 0) {
                answer += Character.toUpperCase(s.charAt(i));
            }

            if(temp == 1) {
                answer += Character.toLowerCase(s.charAt(i));
            }

            index++;
        }

        return answer;
    }
}
