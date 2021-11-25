package If_Else;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PTBacHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = "); a = sc.nextInt();
		System.out.print("Nhập b = "); b = sc.nextInt();
		System.out.print("Nhập c = "); c = sc.nextInt();
		//
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("PT vô số nghiệm");
				} else {System.out.println("PT vô nghiệm");}
			} else {
				float x = (float) -c/b;
				System.out.print("Phương trình có nghiệm x = ");
				DecimalFormat fm = new DecimalFormat("#.###");
				System.out.println(fm.format(x));
			}
		} else {
			float denta = (float) (b*2) - (4*a*c);
			if (denta < 0) {
				System.out.println("PT vô nghiệm"); 
			} else if (denta == 0) {
				System.out.println(" Phuong trình có 1 nghiệm kép x = "+ (float) ((-b)/(2*a)));
			} else {
				System.out.println("PT có 2 nghiệm phân biệt x1 = "+(float) ((-b+Math.sqrt(denta))/(2*a))+", x2 = "
						+ ""+(float) ((-b-Math.sqrt(denta))/(2*a)));
			}
		}
	}

}
