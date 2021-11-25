package VongLap;

import java.util.Scanner;

public class VongLapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n > 0: "); int n = sc.nextInt();
		String nhiPhan = "";
		while (n>0) {
			nhiPhan = n%2 + nhiPhan;
			n = n/2;
		}
		System.out.println("Số nhị phân là: "+nhiPhan);
	}

}
