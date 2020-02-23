package solutions;

public class MyNode {

    private int vertex;
    private int edge;

    public MyNode(int vertex, int edge) {
        this.vertex = vertex;
        this.edge = edge;
    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
}
