package Scanner;

import java.util.Scanner;

public class ScannerTH {
	public static void SinhVien(String mSV, String hoTen, int tuoi, double toan, double van, double anh) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập mã sinh viên: ");
	mSV = sc.nextLine();
	System.out.println("Nhập tên: ");
	 hoTen = sc.nextLine();
	 System.out.println("Nhập tuổi: ");
	 tuoi = sc.nextInt();
	 System.out.println("Nhập điểm toán: ");
	 toan = sc.nextDouble();
	 System.out.println("Nhập điểm văn: ");
	 van = sc.nextDouble();
	 System.out.println("Nhập điểm anh: ");
	 anh = sc.nextDouble();
	 //
	 System.out.println("=========================");
	 System.out.println("Mã Sv: "+mSV);
	 System.out.println("Họ Và Tên: "+hoTen);
	 System.out.println("Tuổi: "+tuoi);
	 System.out.println("Điểm trung bình: "+(toan+van+anh)/3);
	 System.out.println("=========================");
	}
	public static void main(String[] args) {
		SinhVien(null, null, 0, 0, 0, 0);
	}
}
