package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by ohdonggeon on 2020/04/03 9:50 PM
 * Dankook UNIV. Computer Science
 */
public class VirusTest {

	@Test
	public void getAnswer() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/VirusInput.txt"));

		int testcases = sc.nextInt();

		int nodeNum = sc.nextInt();
		int edgeNum = sc.nextInt();
		List<List<Integer>> graph = new ArrayList<>();

		for(int node = 0; node <= nodeNum; node++) {
			graph.add(new ArrayList<>());
		}

		for(int cases = 0; cases < testcases; cases++) {
			for(int num = 0; num < edgeNum; num++) {
				int node = sc.nextInt();
				int linkedNode = sc.nextInt();
				graph.get(node).add(linkedNode);
				graph.get(linkedNode).add(node);
			}

			assertEquals(Virus.getAnswer(graph, nodeNum, edgeNum), sc.nextInt());
		}

		sc.close();
	}
}