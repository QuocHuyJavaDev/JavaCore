package ToanMotNgoi;

import java.util.Scanner;

public class GanDuLieu {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.print("Nhập a = ");  int a = sc.nextInt();
		System.out.print("Nhập b  = "); float b = sc.nextFloat();
		
		//+=
		System.out.println("a +=b = "+(a+=b));
		System.out.println("b += 1 = "+(b+=1));
		//-=
		//*=
		///=
		//%=
		System.out.println("a %= b = "+(a%=b));
	}
}
