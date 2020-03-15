package solutions;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombinationTest {
    @Test
    public void solution() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            Combination combination = new Combination(n, m);
            combination.printSolution();

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}