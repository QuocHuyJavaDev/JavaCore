package BaiTap1;

import java.util.Scanner;

public class Bai4cTrang45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert x = "); 
		int x = sc.nextInt();
		System.out.print("Total = ");
		int total = sc.nextInt();
		if (total > x) {
			x--;
			total -=x;
			System.out.println("Total after = "+total);
		} else {
			System.out.println("Sai");
		}
		
		
	}

}
