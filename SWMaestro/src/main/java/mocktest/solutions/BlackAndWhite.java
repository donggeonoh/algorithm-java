package mocktest.solutions;

/**
 * Created by donggeon on 2020/03/11
 * Dankook UNIV. Computer Science
 * Desc : 소프트웨어 마에스트로 첫 번째 모의문제
 */
import java.io.*;

public class BlackAndWhite {

    String input;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);
    }

    BlackAndWhite(String input) {
        this.input = input;
    }


}