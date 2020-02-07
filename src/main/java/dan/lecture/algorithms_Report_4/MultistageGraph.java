package dan.lecture.algorithms_Report_4;

import java.util.Scanner;

public class MultistageGraph {

    private int[][] directedGraph;
    private int[][] bcost;
    private int[][] bd;
    private int[] level;
    private int shortestLength = 0;

    private int vertex = 0;
    private int edge = 0;
    private int length = 0;

    //초기화 및 정점과 간선의 수 scanner로 입력받기
    public MultistageGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정점과 간선의 수를 입력하세요 : ");

        vertex = sc.nextInt();
        edge = sc.nextInt();

        directedGraph = new int[vertex + 1][vertex + 1];
        level = new int[vertex + 1];
        length = vertex + 1;

        for (int i = 0; i < vertex + 1; i++) {
            for (int j = 0; j < vertex + 1; j++) {
                directedGraph[i][j] = 0;
            }
        }

        for (int i = 0; i < vertex + 1; i++) {
            level[i] = 0;
        }
    }

    //초기화 및 정점과 간선의 수를 매개변수로 입력받기
    public MultistageGraph(int vertex, int edge) {
        this.vertex = vertex;
        this.edge = edge;

        directedGraph = new int[vertex + 1][vertex + 1];
        level = new int[vertex + 1];
        length = vertex + 1;

        for (int i = 0; i < vertex + 1; i++) {
            for (int j = 0; j < vertex + 1; j++) {
                directedGraph[i][j] = 0;
            }
        }

        for (int i = 0; i < vertex + 1; i++) {
            level[i] = 0;
        }
    }

    //최소 비용과 경로를 출력해주는 메서드
    public void shortestPath() {
        int maxLevel;

        vertexOfLevel(1, 1);    //각 정점의 level을 구함

        bd = new int[level[vertex] + 1][length];    //최대 레벨을 알았으니
        bcost = new int[level[vertex] + 1][length];    //두 배열을 초기화
        maxLevel = level[vertex];

        shortestLength = minCost(level[vertex], vertex);//짧은 경로를 찾아

        minPath(maxLevel, vertex);

        System.out.println("\n최솟 값은  " + shortestLength + " 입니다.");
    }

    //최소 비용을 구해주는 메서드
    private int minCost(int level, int vertex) {

        int minCost = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 1; i <= vertex; i++) {
            if (!isEmpty(directedGraph[i][vertex])) {
                int cost = directedGraph[i][vertex] + minCost(level - 1, i);

                if (cost < minCost) {
                    bcost[level][vertex] = cost;
                    minCost = cost;
                    minIndex = i;
                }
            }
        }

        if (minIndex == -1) {
            return 0;
        } else {
            bd[level][vertex] = minIndex;
            return minCost;
        }
    }

    //각 정점의 level을 정해주는 메서드
    private void vertexOfLevel(int vertex, int level) {

        this.level[vertex] = level;
        level++;

        for (int i = 1; i < length; i++) {
            if (!isEmpty(directedGraph[vertex][i])) {
                vertexOfLevel(i, level);
            }
        }
    }

    //최소 경로를 print 해주는 메서드
    private void minPath(int level, int vertex) {

        if (!isEmpty(bd[level][vertex])) {
            minPath(level - 1, bd[level][vertex]);
        } else {
            System.out.print(1 + " ---> ");
            return;
        }

        System.out.print(vertex + " ---> ");

        return;
    }

    //간선을 입력받는 메서드(콘솔 창에서 입력받는 경우)
    public void inputEdge() {
        if (isEmpty(vertex) || isEmpty(edge)) {
            System.out.println("값이 잘못 입력 되었거나 입력한 정점과 간선이 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int row, col, value;

        for (int i = 1; i <= edge; i++) {
            System.out.print(i + " 번째 간선을 입력하세요 : ");

            row = sc.nextInt();
            col = sc.nextInt();
            value = sc.nextInt();

            if (isIndexExceed(row, col)) {
                System.out.println("배열의 범위를 초과 하였습니다. 다시 입력하세요");
                System.out.println();
                i--;
                continue;
            } else if (!isEmpty(directedGraph[row][col])) {
                System.out.println("값이 중복되었습니다. 다시 입력하세요");
                System.out.println();
                i--;
                continue;
            }

            directedGraph[row][col] = value;

        }
    }

    //간선을 입력받는 메서드(코드로 입력하는 경우)
    public void inputEdge(int row, int col, int value) {

        if (isIndexExceed(row, col)) {
            System.out.println("배열의 범위를 초과 하였습니다. 다시 입력하세요");
            System.out.println();

            return;
        } else if (!isEmpty(directedGraph[row][col])) {
            System.out.println("값이 중복되었습니다. 다시 입력하세요");
            System.out.println();

            return;
        }

        directedGraph[row][col] = value;
    }

    //배열의 index를 넘어섰는지 확인해주는 메서드 초과한 경우 true 반환
    private boolean isIndexExceed(int row, int col) {
        if (row >= length || col >= length) {
            return true;
        } else return row <= 0 || col <= 0;

	}

    //값이 0 이하인 경우 true 반환
    private boolean isEmpty(int value) {
		return value <= 0;
    }
}
