package ToanTuDieuKien;

import java.util.Scanner;

public class MathClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = "); double a = sc.nextDouble();
		System.out.print("Nhập b = "); double b = sc.nextDouble();
		//abs: giá trị tuyệt đối
		System.out.println("|a| = "+ Math.abs(a) );
		//acos, asin, atan, acot: tính acos/asin/atan/acot của góc
		
		// cell (double a): tìm ra số nguyên nhỏ nhất lớn hơn or bằng a
		System.out.println("tìm ra số nguyên nhỏ nhất lớn hơn or bằng a là "+ Math.ceil(a));
		//floor (double a): tìm ra gtri nguyên lớn nhất nhỏ hơn or bằng a
		System.out.println("tìm ra gtri nguyên lớn nhất nhỏ hơn or bằng b là "+ Math.floor(b));
		//max/min (double a. double b): 
		System.out.println("số lớn nhất giữa a = "+a+" và b = "+b+" là: " + Math.max(a, b));
		// pow(a,b): a mũ b
		System.out.println("a mũ b = "+ Math.pow(a, b));
		//random: ngẫu nhiên lớn hơn or bằng 0.0, nhỏ hơn 1.0
		System.out.println(Math.random());
		//round: làm tròn
		System.out.println("Làm tròn a = "+a+" là: "+ Math.round(a));
		//sqrt(): căn bậc 2
		System.out.println("căn b = "+ Math.sqrt(b));
		// E và PI
		System.out.println(Math.E);
		System.out.println(Math.PI);
	}
}
