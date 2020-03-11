package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by donggeon on 2020/03/06
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/11729
 * Desc : 하노이의 탑 최소 옮긴 횟수와 이동 경로를 출력하여
 */
public class Solution11729 {

    private static final int NUM_POLE = 3;

    private int plate = 0;
    private int[][] poles;

    private int answer = 0;

    public static void main(String[] args) {
        Solution11729 solution = new Solution11729();
    }

    public Solution11729() {
        init();
    }

    public void init() {

        try {
            Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input11729.txt"));
            plate = sc.nextInt();
            poles = new int[NUM_POLE][plate];
            answer = 0;

            for(int row = 0; row < plate; row++) {
                poles[0][row] = row + 1;
                System.out.println(poles[0][row]);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void solution(int result, int row) {

        if(row == NUM_POLE) {
            return;
        }

        if(isEnded()) {
            if(answer > result) {
                answer = result;
            }
            return;
        }

        for(int index = 0; index < plate; index++) {
            int plate = getPlate(row);

            solution(result + 1, row);
        }
    }

    private int getPlate(int position) {
        int[] pole = poles[position];
        for(int plate = pole.length - 1; plate >= 0; plate--) {
            if(pole[plate] != 0) {
                int temp = pole[plate];
                pole[plate] = 0;
                return temp;
            }
        }
        return 0;
    }

    private int putPlate(int plate) {

        return 0;
    }

    private boolean isEnded() {
        int[] endPole = poles[NUM_POLE - 1];
        for (int plate : endPole) {
            if (plate == 0) {
                return false;
            }
        }
        return true;
    }
}
