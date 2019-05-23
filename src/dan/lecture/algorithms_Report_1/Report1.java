/*  
 *  Algorithm report
 *  Date    : 2019-03-19
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 */

package dan.lecture.algorithms_Report_1;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		
		Scanner	input = new Scanner(System.in);
		int inputN;
		int[] num;
		
		System.out.println("32152661 소프트웨어학과 오동건");
		
		System.out.print("n의 값을 입력하시오 : ");
		inputN = input.nextInt();
		num = new int[inputN];
		
		System.out.print(inputN + "개의 정수를 입력하시오 : ");
		for(int i = 0; i < inputN; i++) {
			num[i] = input.nextInt();
		}
		
		input.close();
		
		for(int i = 0; i < inputN; i++) {		//sort
			for(int j = i; j < inputN; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.print("입력 값의 정렬 결과 : ");
		for(int i = 0; i < inputN; i++) System.out.print(num[i] + " ");
		
		System.out.println("\n32152661 소프트웨어학과 오동건");
	}
}
