package solutions;

public class Hamburger {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int[] weights = new int[N];
            int[] scores = new int[N];

            for (int i = 0; i < N; i++) {
                weights[i] = sc.nextInt();
                scores[i] = sc.nextInt();
            }

            //칼로리가 L이하인 상태에서 tastes의 배열에서 가장 큰 점수를 구한다.
            Tree tree = new Tree(new int[N],0, N, L, weights, scores);
            tree.search();
        }*/

        int N = 5;
        int L = 1000;

        int[] weights = {100, 200, 300, 400, 500};
        int[] scores = {1000, 2000, 3000, 4000, 5000};

        Tree tree = new Tree(new int[5], -1, N, L, weights, scores);
        tree.search();
    }
}

class Tree {
    int[] weights;
    int[] scores;
    int[] choose;

    int num;
    int limit;
    int index;
    int weight = 0;
    int score = 0;

    Tree leftTree;
    Tree rightTree;

    Tree(int[] choose, int index, int num, int limit, int[] weights, int[] scores) {
        this.choose = choose;
        this.index = index;
        this.num = num;
        this.limit = limit;
        this.weights = weights;
        this.scores = scores;
    }

    public void search() {

        index++;

        if (index == num) {
            return;
        }

        int[] temp = new int[num];

        for(int i = 0; i < num; i++) {
            temp[i] = choose[i];
        }

        temp[index] = 0;
        leftTree = new Tree(temp, index, num, limit, weights, scores);
        leftTree.search();

        temp[index] = 1;
        rightTree = new Tree(temp, index, num, limit, weights, scores);
        rightTree.search();

        int weight = 0;
        int score = 0;

        for (int i = 0; i < index; i++) {
            if (choose[i] == 1) {
                weight += weights[i];
                score += scores[i];
            }
        }

        this.weight = weight;
        this.score = score;

        System.out.println("weight : " + weight + " score : " + score + " index : " + index + " choose : " + choose[0] + ", " + choose[1] + ", " + choose[2] + ", " + choose[3] + ", " + choose[4]);
    }
}