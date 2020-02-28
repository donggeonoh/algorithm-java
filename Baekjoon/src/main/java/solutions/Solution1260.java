package solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by donggeon on 2020/02/23
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/1260
 * Desc : 입력된 정점과 간선에서 시작 정점에서의 DFS, BFS를 차례대로 출력하여라.
 * DFS는 Stack, BFS는 Queue를 사용.
 */
public class Solution1260 {

    private final List<List<Integer>> graph;

    private final int vertexNum;
    private final int edgeNum;
    private final int startVertex;

    private final Stack<Integer> stack = new Stack<>();
    private final Queue<Integer> queue = new LinkedList<>();

    private boolean[] visited;

    public Solution1260(List<List<Integer>> graph, int vertexNum, int edgeNum, int startVertex) {
        this.graph = graph;
        this.vertexNum = vertexNum;
        this.edgeNum = edgeNum;
        this.startVertex = startVertex;
    }

    public void solution() {
        depthFirstSearch();
        System.out.println();
        breadthFirstSearch();
    }

    public void depthFirstSearch() {

        init();

        stack.push(startVertex);

        while(!stack.isEmpty()) {
            int currentVertex = stack.pop();

            if(!visited[currentVertex]) {
                System.out.print(currentVertex + " ");
                visited[currentVertex] = true;

                for(int index = graph.get(currentVertex).size() - 1; index >= 0; index--) {
                    int vertex = graph.get(currentVertex).get(index);
                    if(!visited[vertex]) {
                        stack.push(vertex);
                    }
                }
            }
        }
    }

    public void breadthFirstSearch() {

        init();

        queue.offer(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            printVertex(vertex);

            List<Integer> linkedNodeList = graph.get(vertex);
            for(Integer linkedNode : linkedNodeList) {
                if (!visited[linkedNode]) {
                    visited[linkedNode] = true;
                    queue.offer(linkedNode);
                }
            }
        }
    }

    private void printVertex(int vertex) {
        System.out.print(vertex + " ");
    }

    public void init() {
        visited = new boolean[vertexNum + 1];
    }
}