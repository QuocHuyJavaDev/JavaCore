package VongLap;

import java.util.Scanner;

public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert n = "); int n = sc.nextInt();
		SoNguyenTo check = new SoNguyenTo();
		for (int i = 0; i < n+1; i++) {
			if (check.soNguyenTo(i)) {
				System.out.print(i+"  ");
			}
		}
	}
	public boolean soNguyenTo(int i) {
		if (i<=1) {
			return false;
		} 
		for (int j = 2; j < i/2; j++) {
			if (i%j == 0) {
				return false;
			}
		}
		return true;
	}

}
