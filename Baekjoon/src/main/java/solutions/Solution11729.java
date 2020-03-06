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

    int num;

    public Solution11729() {
        init();
    }

    public void init() {
        try {
            Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input11729.txt"));
            num = sc.nextInt();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void solution() {

    }
}
