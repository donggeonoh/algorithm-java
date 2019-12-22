package dan.programmers.solution;

/*
 * Date : 2019-12-22
 * Auth : Oh Dong-geon
 * Description : 문자열 배열에서 n에 해당하는 index로 문자열 배열을 정렬한다.
 *               만약 같은 경우 사전순으로 정렬.
 */

class Solution_level_1_sort_strings {

    public static void main(String[] args) {
        String[] strings = {
                "abc",
                "dfg",
                "hij"
        };

        Solution solution = new Solution();
        solution.solution(strings, 1);
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        if(!isValidate(strings, n)) {
            return answer;
        }

        int length = strings.length;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(strings[i].charAt(n) >= strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        answer = strings;

        return answer;
    }

    public boolean isValidate(String[] strings, int n) {

        if(strings == null || n < 1) {
            return false;
        }

        if(strings.length < 1 || strings.length > 50) {
            return false;
        }

        for(int i = 0; i < strings.length; i++) {

            if(strings[i].length() < 1 || strings[i].length() > 100) {
                return false;
            }
            if(strings[i].length() <= n) {
                return false;
            }

            for(int j = 0; j < strings[i].length(); j++) {
                if('a' > strings[i].charAt(j) || strings[i].charAt(j) > 'z') {
                    return false;
                }
            }
        }

        return true;
    }
}