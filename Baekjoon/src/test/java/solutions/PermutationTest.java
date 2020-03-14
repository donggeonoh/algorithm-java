package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PermutationTest {

    @Test
    public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input10974.txt"));

        for(int i = 0; i < 3; i++) {
            System.out.print("number : ");
            int num = sc.nextInt();
            System.out.println(num);

            Permutation permutation = new Permutation(num);
            permutation.solution(0);
        }
    }
}