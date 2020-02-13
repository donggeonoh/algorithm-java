package solutions;

class Problem17136 {

    private final int NO_ANSWER = -1;
    int answer = Integer.MAX_VALUE;

    public int solution(int[][] testcase) {
        int[] paper = {5, 5, 5, 5, 5};
        return getResult(testcase, paper, 0);
    }

    private int getResult(int[][] testcase, int[] paper, int result) {

        int size = 5;

        for (int i = 0; i < testcase.length; i++) {
            for (int j = 0; j < testcase[i].length; j++) {
                for (int k = size; k > 0; k--) {
                    if (testcase[i][j] == 1) {
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

                        if (m != i + k || o != j + k) {
                            continue;
                        }

                        if(paper[k - 1] == 0) {
                            if(answer == 0) {
                                answer = Integer.MAX_VALUE;
                            }
                        }

                        for (m = i; m < i + k; m++) {
                            for (o = j; o < j + k; o++) {
                                testcase[m][o] = 0;
                            }
                        }
                        paper[k - 1]--;

                        getResult(testcase, paper, ++result);

                        for (m = i; m < i + k; m++) {
                            for (o = j; o < j + k; o++) {
                                testcase[m][o] = 1;
                            }
                        }
                        paper[k - 1]++;
                    }
                }
            }
        }

        if (result < answer) {
            answer = result;
        }

        return answer;
    }

    private void print(int[][] testcase) {
        System.out.println("testcase : ");
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(testcase[j][k] + " ");
            }
            System.out.println();
        }
    }
}