package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution10974Test {

    @Test
    public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input10974.txt"));

        for(int i = 0; i < 3; i++) {
            System.out.print("number : ");
            int num = sc.nextInt();
            System.out.println(num);

            Solution10974 solution10974 = new Solution10974(num);
            solution10974.solution(0);
        }
    }
}