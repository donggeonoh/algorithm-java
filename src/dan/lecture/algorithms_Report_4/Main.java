package dan.lecture.algorithms_Report_4;

public class Main {

    public static void main(String[] args) {
    	MultistageGraph multistageGraph = new MultistageGraph(12, 21);
    	
    	multistageGraph.inputEdge(1, 2, 9);
    	multistageGraph.inputEdge(1, 3, 7);
    	multistageGraph.inputEdge(1, 4, 3);
    	multistageGraph.inputEdge(1, 5, 2);
    	multistageGraph.inputEdge(2, 6, 4);
    	multistageGraph.inputEdge(2, 7, 2);
    	multistageGraph.inputEdge(2, 8, 1);
    	multistageGraph.inputEdge(3, 6, 2);
    	multistageGraph.inputEdge(3, 7, 7);
    	multistageGraph.inputEdge(4, 8, 11);
    	multistageGraph.inputEdge(5, 7, 11);
    	multistageGraph.inputEdge(5, 8, 8);
    	multistageGraph.inputEdge(6, 9, 6);
    	multistageGraph.inputEdge(6, 10, 5);
    	multistageGraph.inputEdge(7, 9, 4);
    	multistageGraph.inputEdge(7, 10, 3);
    	multistageGraph.inputEdge(8, 10, 5);
    	multistageGraph.inputEdge(8, 11, 6);
    	multistageGraph.inputEdge(9, 12, 4);
    	multistageGraph.inputEdge(10, 12, 2);
    	multistageGraph.inputEdge(11, 12, 5);
    	
    	multistageGraph.shortestPath();
    }
}