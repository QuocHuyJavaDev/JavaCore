package ToanTuDieuKien;

import java.util.Scanner;

public class th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = "); int a = sc.nextInt();
		System.out.print("Nhập b = "); int b = sc.nextInt();
		// ==, !=, <, >, <=, >= trả về boolean
		System.out.println("a lớn hơn b =>"+(a>b));
		System.out.println("a bé hơn b =>"+(a<b));
		System.out.println("a bằng b =>"+(a==b));
		System.out.println("a khác b"+(a!=b));
		/*
		 *a && b => true khi cả 2 đều đúng
		 *a || b => true khi a hoặc b hoặc cả 2 đều đúng
		 */
		System.out.println("a lớn hơn b và gấp 2 lần b "+(a>b && a==b*2));
		System.out.println("a lớn hơn b hoặc gấp 2 lần b "+(a>b || a==b*2));
		System.out.println("a là số chẵn, b là số lẻ"+(a%2==0 && b%2 != 0));
		
		//Toán tử điều kiện => (dieukien)?đúng thì return ở đây:sai thì return ở đây
		String ketQua = (a%2==0)?"Số chẵn":"Số lẻ";
		System.out.println(a+" là "+ketQua);
		
		String ketQua2 = (a>0)?"số dương":"số âm";
		System.out.println("a = "+a+" là "+ketQua2);
		
		String ketQua3 = (a%b==0)?"a chia hết cho b":"a không chia hết cho b";
		System.out.println(ketQua3);
	}
}
