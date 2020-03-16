package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PermutationTest {

    @Test
    public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/PermutationInput.txt"));
        int testcases = sc.nextInt();
        for(int cases = 0; cases < testcases; cases++) {
            System.out.print("number : ");
            int num = sc.nextInt();
            System.out.println(num);

            Permutation permutation = new Permutation(num);
            permutation.solution(0);
        }
    }
}