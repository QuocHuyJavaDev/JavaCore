package If_Else;

import java.util.Scanner;

public class SoLonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = "); int a = sc.nextInt();
		System.out.print("Nhập b = "); int b = sc.nextInt();
		System.out.print("Nhập c = "); int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("a là số lớn nhất");
		} if (b > a && b > c) {
			System.out.println("b là số lớn nhất");
		} if (c > a && c > b) {
			System.out.println("c là số lớn nhất");
		}
	}

}
