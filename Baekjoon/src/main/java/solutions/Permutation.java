package solutions;

/**
 * Created by donggeon on 2020/03/02
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/10974
 * Desc : 숫자가 입력되면 그 수의 순열을 모두 출력하시오.
 */
public class Permutation {

    int input;
    int[] numCase;
    boolean[] visited;

    public Permutation(int input) {
        this.input = input;
        numCase = new int[input];
        visited = new boolean[input];
    }

    public void solution(int index) {

        if(input == index) {
            for(int num : numCase) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < input; i++) {
            if(!visited[i]) {
                visited[i] = true;
                numCase[index] = i + 1;
                solution(index + 1);
                visited[i] = false;
            }
        }
    }
}