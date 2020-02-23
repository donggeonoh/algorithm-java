package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Solution1260Test {

    @Test
    public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input1260.txt"));
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        int startVertex = sc.nextInt();

        int[][] input = new int[edge][2];

        for(int row = 0; row < edge; row++) {
            for(int col = 0; col < 2; col++) {
                input[row][col] = sc.nextInt();
            }
        }
    }
}