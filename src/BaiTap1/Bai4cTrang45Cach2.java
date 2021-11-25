package BaiTap1;

import java.util.Scanner;

public class Bai4cTrang45Cach2 {
	static int x, total;
	static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert x = ");
		x = sc.nextInt();
		System.out.print("Insert total = ");
		total = sc.nextInt();
	}
	 Bai4cTrang45Cach2() {
		// TODO Auto-generated constructor stub
		 x--;
		 total -= x;
	}
	 void Display() {
		 System.out.println("x = "+x);
		 System.out.println("total = "+total);
		 System.out.println("======================");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
		Bai4cTrang45Cach2 c1 = new Bai4cTrang45Cach2();
		c1.Display();
		Bai4cTrang45Cach2 c2 = new Bai4cTrang45Cach2();
		c2.Display();
		Bai4cTrang45Cach2 c3 = new Bai4cTrang45Cach2();
		c3.Display();
	}

}
