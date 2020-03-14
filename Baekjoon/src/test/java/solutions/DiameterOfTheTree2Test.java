package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiameterOfTheTree2Test {

    @Test
    public void test() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input1967.txt"));

        int num = scanner.nextInt();
        int[][] input = new int[num - 1][3];

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        DiameterOfTheTree2 diameterOfTheTree2 = new DiameterOfTheTree2(num, input);
        diameterOfTheTree2.printSolution();
    }

}