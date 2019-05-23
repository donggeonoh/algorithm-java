package dan.lecture.algorithms_Report_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Huffman {
	private HuffmanTree huffmanTree = new HuffmanTree();
	private File file = null;
	
	private String str = "";			//읽어들인 file의 문자열
	private String inCodedCode = "";	//문자열 -> 2진수로 변환한 문자열
	private String deCodedCode = "";	//2진수 -> 문자열로 변환한 문자열
	
	public Huffman() {
		file = new File("C:\\Users\\cafa3\\Oh_Workspace\\Algorithm\\src\\dan\\lecture\\algorithms_Report_3\\huff.txt");
		createHuffmanTree();
	}
	public Huffman(String path) {
		file = new File(path);
		createHuffmanTree();
	}
	
	public void printFile() {
		System.out.println("파일의 문자열");
		System.out.println(str);
	}
	
	public void encode() {
		HuffmanNode p = huffmanTree.getRoot();
		int length = str.length();
		char ch;
		
		for(int i = 0; i < length; i++) {
			ch = str.charAt(i);
			encodedChar(p, ch, "");
		}
		
		System.out.println("인코딩 문자열");
		System.out.println(inCodedCode);
	}
	
	private void encodedChar(HuffmanNode p, char value, String result) {
		
		if(p.getLeft() != null) {
			result += "0";
			encodedChar(p.getLeft(), value, result);
		}
		if(p.getRight() != null) {
			result = result.substring(0, result.length() - 1);
			result += "1";
			encodedChar(p.getRight(), value, result);
		}
		
		if(value == p.getData()) {
			inCodedCode += result;
			return;
		}
	}
	
	public void decode() {
		HuffmanNode p = huffmanTree.getRoot();
		int length = inCodedCode.length();
		
		for(int i = 0; i < length; i++) {
			if(inCodedCode.charAt(i) == '0') {
				p = p.getLeft();
			}
			else if(inCodedCode.charAt(i) == '1') {
				p = p.getRight();
			}
			if(p.getData() != 0) {
				deCodedCode += p.getData();
				p = huffmanTree.getRoot();
			}
		}
		
		System.out.println("디코딩 문자열");
		System.out.println(deCodedCode);
	}
	
	public void search() {
		System.out.println("전위순회");
		huffmanTree.preOrder(huffmanTree.getRoot());
	}
	
	private void createHuffmanTree() {
		ArrayList<HuffmanNode> node = new ArrayList<HuffmanNode>();
		FileReader reader;
		int value = 0;
		int size = 0;
		int i, j;
		
		try {
			reader = new FileReader(file);
			while((value = reader.read()) != -1) {
				str = str + (char) value;
				size = node.size();	//연결리스트의 사이즈
				
				for(i = 0; i < size; i++) {	//연결리스트 안에 노드가 있으면 노드에 빈도수 증가
					if(value == node.get(i).getData()) {
						node.get(i).increase();
						break;
					}
				}
				if(i == size) {				//만약 해당 문자의 노드가 없으면 노드 추가
					HuffmanNode addNode = new HuffmanNode((char) value);
					addNode.increase();
					node.add(addNode);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		size = node.size() - 1;
		
		for (i = 0; i < size; i++) {
			int minValue1 = Integer.MAX_VALUE, minValue2 = Integer.MAX_VALUE;
			int minNode1 = 0, minNode2 = 0;
			int length = node.size();
			
			for(j = 0; j < length; j++) {
				if(minValue1 > node.get(j).getPriority()) {
					minNode1 = j;	//작은 값 선택
				}
			}
			
			for(j = 1; j < length; j++) {
				if(minValue2 > node.get(j).getPriority()) {
					if(minNode1 != j) {
						minNode2 = j; //작은 값 선택 (minNode1을 제외한 다른 것을 선택)
					}
				}
			}
			
			node.add(new HuffmanNode(node.get(minNode1), node.get(minNode2)));
			node.remove(node.get(minNode1));
			node.remove(node.get(minNode2));
		}
		
		huffmanTree = new HuffmanTree(node.get(0));
	}
}