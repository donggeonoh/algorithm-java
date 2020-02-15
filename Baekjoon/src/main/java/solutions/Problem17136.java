package solutions;

class Problem17136 {

    int answer = Integer.MAX_VALUE;
    int result = 0;

    public int solution(int[][] testcase) {
        int[] paper = {5, 5, 5, 5, 5};

        getResult(testcase, paper);

        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }
        return answer;
    }

    private void getResult(int[][] testcase, int[] paper) {

        int size = 5;

        for (int i = 0; i < testcase.length; i++) {
            for (int j = 0; j < testcase[i].length; j++) {
                if (testcase[i][j] == 1) {
                    for (int k = size; k > 0; k--) {
                        if (i + k > testcase.length || j + k > testcase[i].length) {
                            continue;
                        }

                        int m = 0, o = 0;
                        for (m = i; m < i + k; m++) {
                            for (o = j; o < j + k; o++) {
                                if (testcase[m][o] == 0) {
                                    break;
                                }
                            }
                            if (o != (j + k)) {
                                break;
                            }
                        }

                        if (m != i + k || o != j + k || paper[k - 1] == 0) {
                            continue;
                        }

                        for (m = i; m < i + k; m++) {
                            for (o = j; o < j + k; o++) {
                                testcase[m][o] = 0;
                            }
                        }
                        paper[k - 1]--;
                        result++;

                        getResult(testcase, paper);

                        for (m = i; m < i + k; m++) {
                            for (o = j; o < j + k; o++) {
                                testcase[m][o] = 1;
                            }
                        }
                        paper[k - 1]++;
                        result--;
                    }
                    return;
                }
            }
        }

        if (result < answer) {
            answer = result;
        }
    }
}