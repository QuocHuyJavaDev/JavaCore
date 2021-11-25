package VongLap;

import java.util.Scanner;

public class BT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert n = "); int n = sc.nextInt();
		for (int i = 1; i < 21; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
