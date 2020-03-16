package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DFSAndBFSTest {

    @Test
    public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/DFSAndBFSInput.txt"));
        int testcase = sc.nextInt();
        for (int cases = 0; cases < 3; cases++) {
            int vertex = sc.nextInt();
            int edge = sc.nextInt();
            int startVertex = sc.nextInt();

            System.out.println();
            System.out.println("vertex : " + vertex + " edge : " + edge + " startVertex : " + startVertex);

            List<List<Integer>> input = new LinkedList<>();

            for (int i = 0; i <= vertex; i++) {
                input.add(new LinkedList<>());
            }

            for (int i = 0; i < edge; i++) {
                int currentNode = sc.nextInt();
                int linkedNode = sc.nextInt();
                input.get(currentNode).add(linkedNode);
                input.get(linkedNode).add(currentNode);
            }

            for (int i = 0; i <= vertex; i++) {
                Collections.sort(input.get(i));
            }

            System.out.println("===RESULT===");
            sc.nextLine();
            for (int i = 0; i < 2; i++) {
                System.out.println(sc.nextLine());
            }
            System.out.println("============");

            DFSAndBFS solution = new DFSAndBFS(input, vertex, edge, startVertex);
            solution.solution();
        }
    }
}