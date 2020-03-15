package solutions;

/**
 * Created by donggeon on 2020/03/04
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2407
 * Desc : nCm을 출력한다.
 */
public class Combination {

    private final int n;
    private final int m;

    private int answer = 0;

    Combination(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public void printSolution() {
        getAnswer(0, 0);
        printAnswer();
    }

    private void getAnswer(int index, int select) {

        if(m == select) {
            answer++;
            return;
        }

        if(n == index) {
            return;
        }

        getAnswer(index + 1, select + 1);
        getAnswer(index + 1, select);
    }

    private void printAnswer() {
        System.out.println(answer);
    }
}