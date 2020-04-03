package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by ohdonggeon on 2020/04/03 8:59 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2606
 * Desc : 바이러스가 걸린 컴퓨터가 연결된 컴퓨터(노드) 간 전염이 되는데, 몇 개의 컴퓨터가 전염이 되었는가?
 * Input : 컴퓨터의 수, 컴퓨터가 연결된 쌍의 수, 노드 간 연결된 쌍 (이전 입력된 연결된 쌍의 수 만큼)
 */
public class Virus {

	private static final int WORM_VIRUS_INDEX = 1;

	private static List<List<Integer>> graph;
	private static int nodeNum;
	private static int edgeNum;

	private static int answer = -1;
	private static boolean visited[];

	private Virus() {

	}

	public static int getAnswer(List<List<Integer>> graph, int node, int edge) {
		Virus.graph = graph;
		Virus.nodeNum = node;
		Virus.edgeNum = edge;
		visited = new boolean[nodeNum + 1];

		getAnswer(WORM_VIRUS_INDEX);

		return answer;
	}

	private static void getAnswer(int index) {
		if(visited[index]) {
			return;
		}
		visited[index] = true;
		answer++;
		for(int linkedNodeNum = 0; linkedNodeNum < graph.get(index).size(); linkedNodeNum++) {
			getAnswer(graph.get(index).get(linkedNodeNum));
		}
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int nodeNum = Integer.parseInt(reader.readLine());
		int edgeNum = Integer.parseInt(reader.readLine());
		List<List<Integer>> graph = new ArrayList<>();

		for(int size = 0; size <= nodeNum; size++) {
			graph.add(new ArrayList<>());
		}

		for(int size = 0; size < edgeNum; size++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int node = Integer.parseInt(tokenizer.nextToken());
			int linkedNode = Integer.parseInt(tokenizer.nextToken());

			graph.get(node).add(linkedNode);
			graph.get(linkedNode).add(node);
		}

		System.out.println(Virus.getAnswer(graph, nodeNum, edgeNum));

		reader.close();
	}
}
