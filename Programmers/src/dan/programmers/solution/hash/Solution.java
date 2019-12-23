package dan.programmers.solution.hash;

/*
 * Date : 2019-12-23
 * Auth : Oh Dong-geon
 * Description : 프로그래머스 완주하지 못한 선수 문제 솔루션입니다.
 *
 */

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String result = solution.solution(participant, completion);

        System.out.println(result);
    }
}

public class Solution {
    public String solution(String[] participants, String[] completions) {
        HashMap<String, Integer> c = new HashMap<>();
        String result = "";

        for(String completion : completions) {
            if(c.get(completion) != null) {
                c.put(completion, c.get(completion) + 1);
                continue;
            }
            c.put(completion, 1);
        }

        for(String participant : participants) {
            if(c.get(participant) == null) {
                result = participant;
                break;
            }
            c.put(participant, c.get(participant) - 1);

            if(c.get(participant) < 0) {
                result = participant;
                break;
            }
        }

        return result;
    }
}
