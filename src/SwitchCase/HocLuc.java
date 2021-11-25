package SwitchCase;

import java.util.Scanner;

public class HocLuc {
	public static void main(String[] args) {
			Scanner sc =  new Scanner(System.in);
			System.out.print("Nhập điểm Chữ:");
			String input = sc.next();
			char grade = input.charAt(0);
			switch (grade) {
			case 'A':
				System.out.println("Học lực giỏi");
				break;
			case 'B':
				System.out.println("Học lực khá");
				break;
			case 'C':
				System.out.println("Học lực TB");
				break;
			case 'D':
				System.out.println("Học lực Yếu");
				break;
				
			default:
				System.out.println("Điểm chữ gồm A,B,C,D. Nhập lại.");
				break;
			}
	}
}
