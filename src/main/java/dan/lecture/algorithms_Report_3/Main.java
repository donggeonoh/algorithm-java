package dan.lecture.algorithms_Report_3;

public class Main {

    public static void main(String[] args) {
        Huffman[] huff = new Huffman[3];
        String[] path = new String[3];

        path[0] = "C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\32152661.txt";
        path[1] = "C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\Software.txt";
        path[2] = "C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\Oh Donggeon.txt";

        for (int i = 0; i < 3; i++) {
            huff[i] = new Huffman(path[i]);
            huff[i].search();
            huff[i].printFile();
            huff[i].encode();
            huff[i].decode();
            System.out.println();
        }
    }
}