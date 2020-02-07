package solutions;

public class Snail {
    public int[][] solution(int n) {

        int[][] result = new int[n][n];
        int num = 1;

        for(int i = 0; i < n; i++) {
            int j = i;

            //왼쪽 -> 오른쪽
            for (j = i; j < n; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = num;
                    num++;
                } else {
                    break;
                }
            }

            j--;
            int k = i + 1;

            //위쪽 -> 아래쪽
            for(; k < n; k++) {
                if(result[k][j] == 0) {
                    result[k][j] = num;
                    num++;
                } else {
                    break;
                }
            }

            j--;
            k--;

            //오른쪽 -> 왼쪽
            for(; j >= 0; j--) {
                if(result[k][j] == 0) {
                    result[k][j] = num;
                    num++;
                } else {
                    break;
                }
            }

            j++;
            k--;

            //아래쪽 -> 위쪽
            for(; k >= 0; k--) {
                if(result[k][j] == 0) {
                    result[k][j] = num;
                    num++;
                } else {
                    break;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }

        return result;
    }
}
