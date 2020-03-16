package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberingApartmentComplexTest {

    @Test
    public void solution() throws FileNotFoundException {
        NumberingApartmentComplex numberingApartmentComplex = new NumberingApartmentComplex();
        Scanner scanner = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/NumberingApartmentComplexInput.txt"));

        int size = scanner.nextInt();
        int[][] testcase = new int[size][size];

        for(int i = 0 ; i < size; i++) {
            String str = scanner.next();
            for(int j = 0; j < size; j++) {
                testcase[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        numberingApartmentComplex.solution(testcase);
    }
}