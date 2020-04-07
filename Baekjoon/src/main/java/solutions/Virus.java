package solutions;

import java.util.List;

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
