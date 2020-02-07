package dan.lecture.algorithms_Report_3;

public class HuffmanNode {
    private int priority = 0;
    private char data = 0;
    private HuffmanNode left = null;
    private HuffmanNode right = null;

    public HuffmanNode() {
    }

    public HuffmanNode(char data) {
        this.data = data;
    }

    public HuffmanNode(HuffmanNode left, HuffmanNode right) {
        this.priority = left.priority + right.priority;
        this.data = 0;
        this.left = left;
        this.right = right;
    }

    public char getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }

    public void increase() {
        this.priority++;
    }

    public HuffmanNode getLeft() {
        return left;
    }

    public HuffmanNode getRight() {
        return right;
    }
}