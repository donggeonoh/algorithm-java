package dan.baekjoon.solution;

public class Problem17136 {

    int[] paperCount = {5, 5, 5, 5, 5};


    public int solution(int[][] testcase) {

        int result = -1;

        for(int i = 0; i< testcase.length; i++) {
            for(int j = 0; j < testcase[i].length; j++) {
                int count = 0;
                if(testcase[i][j] == 1) {
                    for(int k = 0; k < testcase[i].length; k++) {
                        if(testcase[i][k] == 1) {
                            count++;
                        }
                    }
                }


            }
        }

        return result;
    }
}
