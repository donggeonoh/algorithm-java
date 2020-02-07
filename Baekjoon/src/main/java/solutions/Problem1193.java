/*
 *  Problem : https://www.acmicpc.net/problem/1193
 *  Date    : 2019-03-21
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package solutions;

import java.util.Scanner;

public class Problem1193 {

	public static void main(String[] args) {
		int input = new Scanner(System.in).nextInt();
		new Solution1193(input);
	}
}

class Solution1193 {
	public Solution1193(int input) {
		findFountain(input);
	}
	
	public void findFountain(int input) {
		int nume = 2;
		int deno = 1;
		int i = 3;
		
		if(input <= 0) return;
		else if(input == 1) {
			System.out.println("1/1");
			return;
		}
		else if(input == 2) {
			System.out.println("1/2");
			return;
		}
		
		while(i < input) {
			if(nume == 1 || deno == 1) {
				if(nume == 1) {
					deno++;
					i++;
				}
				else {
					nume++;
					i++;
				}
			}
			
			if(i < input) {
				if(nume > deno) {
					while(nume != 1 && i < input) {
						nume -= 1;
						deno++;
						i++;
					}
				}
				else {
					while(deno != 1 && i < input) {
						deno -= 1;
						nume++;
						i++;
					}
				}
			}
		}
		
		System.out.println(nume + "/" + deno);
		return;
	}
}