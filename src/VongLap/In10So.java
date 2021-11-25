package VongLap;

import java.util.Scanner;

public class In10So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		int dem = 0;
		for (int i = 0; i <= n; i++) {
			if (i < 5) {
				continue;
			}
			System.out.print(i+"  ");
			dem++;
			
		}
		System.out.println("\nSo "+dem);
	}

}
