package dan.programmers.solution.level1;

/*
 * Date : 2019-12-22
 * Auth : Oh Dong-geon
 * Description : �� 3���� ��ȸ�� ����Ͽ� ��Ʈ�� ������.
 *               ������ ��� ������ �� ���� ����
 *               S, D, T�� ��� S = ����^1, D = ����^2, T = ����^3
 *
 */

class Main {
    public static void main(String[] args) {
        Solution_level_1_dart solution_level_1_dart = new Solution_level_1_dart();
        String test = "1S2D*3T#";

        solution_level_1_dart.solution(test);

    }
}

class Solution_level_1_dart {

    public int solution(String dartResult) {
        int num[] = new int[3];
        int answer = 0;
        int length = dartResult.length();
        int index = 0;

        for(int i = 0; i < length; i++) {

            if(Character.isDigit(dartResult.charAt(i))) {
                num[index] = Character.getNumericValue(dartResult.charAt(i));
                index++;
                continue;
            }

            if(dartResult.charAt(i) == 'D') {
                num[index] *= num[index];
            }

            if(dartResult.charAt(i) == 'T') {
                int temp = num[index];
                num[index] *= temp;
                num[index] *= temp;
            }

            if(dartResult.charAt(i) == '*') {
                for(int j = 0; j < index; j++) {
                    num[index] *= 2;
                }
            }

            if(dartResult.charAt(i) == '#') {
                num[index] *= -1;
            }
        }

        for(int i = 0; i < num.length; i++) {
            answer += num[i];
        }

        return answer;
    }
}