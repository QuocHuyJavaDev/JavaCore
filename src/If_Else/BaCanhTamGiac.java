package If_Else;

import java.util.Scanner;

public class BaCanhTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a = "); int a = sc.nextInt();
		System.out.print("Insert b = "); int b = sc.nextInt();
		System.out.print("Insert c = "); int c = sc.nextInt();
		if (a+b>c || a+c>b || b+c>a) {
			System.out.println("3 số này là 3 cạnh của một tam giác");
		} else {
			System.out.println("No");
		}
	}

}
