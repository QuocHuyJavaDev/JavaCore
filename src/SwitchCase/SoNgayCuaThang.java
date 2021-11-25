package SwitchCase;

import java.util.Scanner;

public class SoNgayCuaThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng: "); int thang = sc.nextInt();
		System.out.println("Nhập năm: "); int nam = sc.nextInt();
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("Tháng "+thang+", năm "+nam+" có 31 ngày ");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("Tháng "+thang+", năm "+nam+" có 30 ngày ");
			break;
		}
		case 2: {
			if(nam%4==0 && nam%100!=0 || nam%400==0) {
				System.out.println("Tháng 2 năm nhuận có 29 ngày");
			} else {
				System.out.println("Tháng 2 năm không nhuận có 28 ngày");
			} break;
		}
		default:
			System.out.println("Nhập sai");
		}
	}

}
