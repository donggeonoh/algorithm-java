package dan.lecture.algorithms_Report_3;

public class Main {

	public static void main(String[] args) {
		Huffman[] huff = new Huffman[3];
		String[] path = new String[3];

		path[0] = "C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\32152661.txt";
		path[1] = "C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\Software.txt";
		path[2] = "C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\Oh Donggeon.txt";

		for(int i = 0; i < 3; i++) {
			huff[i] = new Huffman(path[i]);
			huff[i].search();		//전위순회
			huff[i].printFile();	//파일에 입력해놓은 문자열 출력
			huff[i].encode();		//부호화한 문자열 출력
			huff[i].decode();		//복호화한 문자열 출력
			System.out.println();
		}
	}
}