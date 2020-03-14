package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiameterOfTheTree1Test {

    @Test
    public void solution() throws FileNotFoundException {
        new DiameterOfTheTree1(getInput()).solution();
    }

    public List<List<MyNode>> getInput() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input1167.txt"));

        int nodeNum = scanner.nextInt();
        List<List<MyNode>> nodes = new ArrayList<>();

        for(int i = 0; i < nodeNum; i++) {
            int node = scanner.nextInt();
            nodes.add(new ArrayList<>());

            int vertex;
            while((vertex = scanner.nextInt()) != -1) {
                int edge = scanner.nextInt();
                nodes.get(node - 1).add(new MyNode(vertex - 1, edge));
            }
        }
        scanner.close();

        return nodes;
    }
}