package solutions;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  Problem : https://www.acmicpc.net/problem/2667
 *  Date    : 2020-02-17
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 */
public class Problem2667 {

    private ArrayList<Integer> complex = new ArrayList<>();
    private int[][] testcase;
    private int maxSize;
    private int complexNum = 0;

    public void solution(int[][] testcase) {
        this.testcase = testcase;
        this.maxSize = testcase.length;

        search();
        Collections.sort(complex);
        complex.add(0, complex.size());

        for (Integer output : complex) {
            System.out.println(output);
        }
    }

    private void search() {

        for (int row = 0; row < maxSize; row++) {
            for (int col = 0; col < maxSize; col++) {
                if (testcase[row][col] == 1) {
                    getComplex(row, col);
                    complex.add(complexNum);
                    complexNum = 0;
                }
            }
        }

    }

    private void getComplex(int row, int col) {

        if (isBoundOfIndex(row, col)) {
            return;
        }

        if (testcase[row][col] == 1) {
            testcase[row][col] = 0;
            complexNum++;

            getComplex(row - 1, col);
            getComplex(row + 1, col);
            getComplex(row, col - 1);
            getComplex(row, col + 1);
        }
    }

    private boolean isBoundOfIndex(int row, int col) {
        return row == -1 || col == -1 || row == maxSize || col == maxSize;
    }
}