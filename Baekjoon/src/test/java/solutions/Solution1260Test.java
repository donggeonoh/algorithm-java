package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution1260Test {

    @Test
    public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input1260.txt"));
        for (int testcase = 0; testcase < 3; testcase++) {
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

            for (int i = 0; i < input.size(); i++) {
                System.out.println("node : " + i);
                for (int j = 0; j < input.get(i).size(); j++) {
                    System.out.print(input.get(i).get(j) + " ");
                }
                System.out.println();
            }

            System.out.println("===RESULT===");
            sc.nextLine();
            for (int i = 0; i < 2; i++) {
                System.out.println(sc.nextLine());
            }
            System.out.println("============");

            Solution1260 solution = new Solution1260(input, vertex, edge, startVertex);
            solution.solution();
        }
    }
}