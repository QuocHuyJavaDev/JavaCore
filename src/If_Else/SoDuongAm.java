package If_Else;

import java.util.Scanner;

public class SoDuongAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert n = "); int n = sc.nextInt();
		if (n >= 0) {
			System.out.println("This is a positive integer");
		} else {
			System.out.println("This is a negative integer");
		}
	}

}
