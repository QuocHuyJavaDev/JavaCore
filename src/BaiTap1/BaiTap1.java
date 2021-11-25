//Hiển thị bảng cửu chương cho một số bất kỳ.
package BaiTap1;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		System.out.println("Bảng cửu chuong "+n+": ");
		while (true) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(n+" x "+j+" = "+n*j);
			}
			break;
		}
	}
}
