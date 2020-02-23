package solutions;

import java.util.List;

/*
 *  Problem : https://www.acmicpc.net/problem/1167
 *  Date    : 2020-02-23
 *  Dankook UNIV. Computer Science
 *  Oh Donggeon
 *  Desc : 1967번과 똑같은 문제. 정점과 정점 사이 제일 먼 거리를 구하여라.
 */
public class Solution1167 {

    private final List<List<MyNode>> nodes;
    private final int nodesSize;

    private int farthestNode = 0;
    private int answer = 0;

    private boolean[] visited;
    private int length;

    public Solution1167(List<List<MyNode>> nodes) {
        this.nodes = nodes;
        this.nodesSize = nodes.size();
        init();
    }

    public void solution() {
        getFarthestNode(0);
        init();
        getFarthestNode(farthestNode);
        System.out.println(answer);
    }

    private void getFarthestNode(int outerIndex) {

        if(visited[outerIndex]) {
            return;
        }
        visited[outerIndex] = true;

        for(int innerIndex = 0; innerIndex < nodes.get(outerIndex).size(); innerIndex++) {

            MyNode node = nodes.get(outerIndex).get(innerIndex);
            length += node.getEdge();
            getFarthestNode(node.getVertex());
            length -= node.getEdge();

            if(answer < length) {
                farthestNode = outerIndex;
                answer = length;
            }
        }
    }

    private void init() {
        visited = new boolean[nodesSize];
        length = 0;
    }
}