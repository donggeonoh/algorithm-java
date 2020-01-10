package dan.programmers.solution.stackandqueue;

import java.util.Stack;

public class Tower {
    public static void main(String[] args) {
        TowerSolution solution = new TowerSolution();
        int[] input = {6, 9, 5, 7, 4};

        solution.solution(input);
    }
}

class TowerSolution {
    public int[] solution(int[] heights) {
        Stack<Integer> tower = new Stack<>();
        int[] answer = new int[heights.length];

        for(int i = 0; i < heights.length; i++) {
            tower.push(heights[i]);
            answer[i] = 0;
        }

        String str = "";
        str += 'a';

        for(int i = tower.size() - 1; !tower.isEmpty(); i--) {
            int height = tower.pop();

            for(int j = tower.size() - 1; j >= 0; j--) {
                if(height < tower.elementAt(j)) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        for(int arg : answer) {
            System.out.println(arg);
        }

        return answer;
    }
}
