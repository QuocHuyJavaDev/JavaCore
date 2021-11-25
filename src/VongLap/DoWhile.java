package VongLap;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		 Scanner sc = new Scanner(System.in);
		 do {
			System.out.print("Nhap vao n >0: ");
			n= sc.nextInt();
		} while (n<=0);
	}

}
