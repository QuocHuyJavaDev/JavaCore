package SwitchCase;

import java.util.Scanner;

public class Menu {
	public static float chuViHCN(float dai, float rong) {
		return (dai+rong)*2;
	}
	public static float DienTicHCN(float dai, float rong) {
		return (dai*rong);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Chọn 1 nếu muốn tính chu vi HCN, 2 nếu muốn tính diện tích HCN.");
		System.out.print("Vui lòng chọn: "); int n = sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("Bạn đã chọn tính chu vi.");
			System.out.print("Nhập chiều dài:"); float dai = sc.nextFloat();
			System.out.print("Nhập chiều rộng:"); float rong = sc.nextFloat();
			System.out.println("Chu vi là: " +chuViHCN(dai, rong));
			break;
	
		}
		case 2: {
			System.out.println("Bạn đã chọn tính diện tích.");
			System.out.print("Nhập chiều dài:"); float dai = sc.nextFloat();
			System.out.print("Nhập chiều rộng:"); float rong = sc.nextFloat();
			System.out.println("Diện tích là: " +DienTicHCN(dai, rong));
			break;
		}
		default:
			System.out.println("Nhập sai");
		}
	}

}
