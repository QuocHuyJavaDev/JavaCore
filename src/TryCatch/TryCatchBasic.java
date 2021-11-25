package TryCatch;

import java.util.Scanner;

public class TryCatchBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.print("Nhap n: "); n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhap sai");
		}
	}

}
