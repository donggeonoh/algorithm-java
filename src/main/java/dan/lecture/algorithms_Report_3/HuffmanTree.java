package dan.lecture.algorithms_Report_3;

public class HuffmanTree {
    private HuffmanNode root;

    public HuffmanTree() {
        root = new HuffmanNode();
    }

    public HuffmanTree(HuffmanNode node) {
        root = node;
    }

    public HuffmanNode getRoot() {
        return root;
    }

    public void preOrder(HuffmanNode p) {
        if (p == null) return;
        if (p.getData() != 0) {
            System.out.println("data : " + p.getData() + " " + "빈도수 : " + p.getPriority());
        }
        preOrder(p.getLeft());
        preOrder(p.getRight());
    }
}
