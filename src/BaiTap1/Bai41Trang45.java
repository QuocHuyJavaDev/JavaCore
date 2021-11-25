package BaiTap1;

import java.util.Scanner;

public class Bai41Trang45 {
	static int x = 2;
	static int y = 5;
	static int z = 0;
	Bai41Trang45() {
		z = x + y;
		x++;
	}
	void display() {
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("--------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai41Trang45 c1 = new Bai41Trang45();
		c1.display();
		Bai41Trang45 c2 = new Bai41Trang45();
		c2.display();
		Bai41Trang45 c3 = new Bai41Trang45();
		c3.display();
	}

}
