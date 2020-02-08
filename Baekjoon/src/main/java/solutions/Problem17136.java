package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Problem17136 {

    //각 색종이의 갯수
    int[] number;
    int result;

    public int solution(int[][] testcase) {

        if(testcase == null) {
            return -1;
        }

        number = new int[] {5, 5, 5, 5, 5};
        result = 0;

        getResult(number.length, testcase);

        return result;
    }

    public void getResult(int size, int[][] testcase) {

        if(size == 0) {
            return;
        }

        for(int i = 0; i < testcase.length; i++) {
            for(int j = 0; j < testcase[i].length; j++) {

                if(testcase[i][j] != 0) {
                    //만약 색종이의 사이즈가 종이의 크기를 벗어난다면 continue
                    if(i + size > testcase.length || j + size > testcase[i].length) {
                        continue;
                    }

                    //size에 해당하는 색종이가 들어가는지 확인
                    int k = 0, m = 0;
                    for(k = i; k < i + size; k++) {
                        for(m = j; m < j + size; m++) {
                            if(testcase[k][m] == 0) {
                                break;
                            }
                        }
                        if(m != (j + size)) {
                            break;
                        }
                    }

                    if(k == i + size && m == j + size) {

                        if(number[size - 1] - 1 < 0) {
                            number[size - 1]--;
                            result = -1;
                            return;
                        }

                        number[size - 1]--;
                        result++;

                        for(k -= size; k < i + size; k++) {
                            for(m -= size; m < j + size; m++) {
                                testcase[k][m] = 0;
                            }
                        }
                    }
                }
            }
        }

        size--;
        getResult(size, testcase);
    }
}

class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/main/java/testcases/Problem17136.txt"));
        int[][] testcase = new int[10][10];

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    testcase[j][k] = scanner.nextInt();
                }
            }
            Problem17136 problem = new Problem17136();
            int result = problem.solution(testcase);

            System.out.println(result);
        }
/*
        Problem17136 problem = new Problem17136();

        int result = problem.solution(testcase);
        System.out.print(result);*/
    }
}