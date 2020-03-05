package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by donggeon on 2020/03/04
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2407
 * Desc : nCm을 출력한다.
 */
public class Solution2407 {

    private static int n = 0;
    private static int m = 0;

    private static int result = 0;

    public static void input() {
        try {
            Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input2407.txt"));
            n = sc.nextInt();
            m = sc.nextInt();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void solution(int index, int select) {

        if(m == select) {
            result++;
            return;
        }

        if(n == index) {
            return;
        }

        solution(index + 1, select + 1);
        solution(index + 1, select);
    }

    public static int print() {
        System.out.println(result);
        return result;
    }
}
