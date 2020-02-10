package solutions;

class Problem17136 {

    int result = 0;

    public int solution(int[][] testcase) {
        int[] paper = {5, 5, 5, 5, 5};
        return getResult(testcase, paper);
    }

    private int getResult(int[][] testcase, int[] paper) {

        int size = 5;

        for (int i = 0; i < testcase.length; i++) {
            for (int j = 0; j < testcase[i].length; j++) {
                for(int k = size; k > 0; k--) {
                    if (testcase[i][j] == 1) {
                        if (i + k > testcase.length || j + k > testcase.length) {
                            continue;
                        }
                        int[][] temp = testcase;
                        int[] tempPaper = paper;
                        tempPaper[k - 1]--;

                        for (int m = i; m < i + size; m++) {
                            for (int o = j; o < j + size; o++) {
                                temp[m][o] = 0;
                            }
                        }

                        getResult(testcase, paper);
                    }
                }
                testcase[i][j] = 0;
            }
        }

        return 0;
    }

    /*
    public int solution(int[][] testcase) {

        if(testcase == null) {
            return -1;
        }
        this.testcase = testcase;
        getResult(5);

        return result;
    }

    public void getResult(int size) {

        if(size == 0) {
            return;
        }

        int[][] testcase = this.testcase;
        int[] number = new int[] {5, 5, 5, 5, 5};
        int num = 0;

        for(int d = size; d > 0; d--) {
            for(int i = 0; i < testcase.length; i++) {
                for(int j = 0; j < testcase[i].length; j++) {

                    if(testcase[i][j] != 0) {
                        //만약 색종이의 사이즈가 종이의 크기를 벗어난다면 continue
                        if(i + d > testcase.length || j + d > testcase[i].length) {
                            continue;
                        }

                        //size에 해당하는 색종이가 들어가는지 확인
                        int k = 0, m = 0;
                        for(k = i; k < i + d; k++) {
                            for(m = j; m < j + d; m++) {
                                if(testcase[k][m] == 0) {
                                    break;
                                }
                            }
                            if(m != (j + d)) {
                                break;
                            }
                        }

                        if(k == i + d && m == j + d) {

                            if(number[d - 1] - 1 < 0) {
                                num = -1;
                                break;
                            }

                            number[d - 1]--;
                            num++;

                            //붙인 색종이는 0으로 한다.
                            for(k -= d; k < i + d; k++) {
                                for(m -= d; m < j + d; m++) {
                                    testcase[k][m] = 0;
                                }
                            }
                        }
                    }
                }
                if(num == -1) {
                    break;
                }
            }
        }

        System.out.print(num + " ");

        if(result == -1) {
            result = num;
        }
        else if(num != 0 && num < result) {
            result = num;
        }

        size--;
        getResult(size);
    }
    */
}