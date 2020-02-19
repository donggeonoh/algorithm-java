package solutions.hash;

import java.util.HashMap;

/*
 * Date : 2019-12-25
 * Auth : Oh Dong-geon
 * Description : 프로그래머스 위장 문제 솔루션입니다.
 */
class Camouflage {

    public static void main(String[] args) {
        CamouflageSolution solution = new CamouflageSolution();
        String[][] input = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        solution.solution(input);
    }
}

class CamouflageSolution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> h = new HashMap<>();
        int answer = 1;

        for(String[] cloth : clothes) {
            if(h.containsKey(cloth[1])) {
                h.replace(cloth[1], h.get(cloth[1]) + 1);
            }
            else {
                h.put(cloth[1], 1);
            }
        }

        for(int value : h.values()) {
            answer *= (value + 1);
        }

        answer -= 1;
        System.out.println(answer);

        return answer;
    }
}