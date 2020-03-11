package mocktest.solutions;

/**
 * Created by donggeon on 2020/03/11
 * Dankook UNIV. Computer Science
 * Desc : 소프트웨어 마에스트로 첫 번째 모의문제
 */
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackAndWhite {

    private int seqSize;
    private int pick;
    private int[] sequence;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tn = new StringTokenizer(br.readLine());
        int seqSize = Integer.parseInt(tn.nextToken());
        int pick = Integer.parseInt(tn.nextToken());

        tn = new StringTokenizer(br.readLine());
        int[] sequence = new int[seqSize];

        for(int index = 0; index < seqSize; index++) {
            sequence[index] = Integer.parseInt(tn.nextToken());
        }

        System.out.println("Hello Goorm! Your input is " + seqSize);
        System.out.println("Hello Goorm! Your input is " + pick);
        System.out.println("Hello Goorm! Your input is " + Arrays.toString(sequence));

        new BlackAndWhite(seqSize, pick, sequence).solution();
    }

    BlackAndWhite(int seqSize, int pick, int[] sequence) {
        this.seqSize = seqSize;
        this.pick = pick;
        this.sequence = sequence;
    }

    public void solution() {

    }
}