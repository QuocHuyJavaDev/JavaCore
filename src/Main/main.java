package Main;

import ChuViDienTich.HinhChuNhat;
import ChuViDienTich.HinhTron;
import ChuViDienTich.hinhThang;
import java.util.Scanner;
import Scanner.ScannerTH;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dai = 10.0f;
		float rong = 6.0f;
		
		System.out.println(HinhChuNhat.chuVi(dai, rong));
		System.out.println(HinhChuNhat.dienTich(dai, rong));
		
		float r = 4.5f;
		System.out.println(HinhTron.chuVi(r));
		System.out.println(HinhTron.dienTich(r));
		
		float dayLon = 10, dayNho = 7, h = 5.4f;
		System.out.println(hinhThang.dienTich(dayLon, dayNho, h));
		
		
	
	}

}
