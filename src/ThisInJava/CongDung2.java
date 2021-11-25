//Noi cac constructor
package ThisInJava;

public class CongDung2 {
	int tuoi;
	String ten;
	String gioiTinh;
	public CongDung2(String ten, int tuoi) {
		// TODO Auto-generated constructor stub
		System.out.println("hh");
		this.ten = ten;
		this.tuoi = tuoi;
	}
	public CongDung2(int tuoi, String ten, String gioiTinh) {
		// TODO Auto-generated constructor stub
		this(ten, tuoi);
		this.gioiTinh = gioiTinh;
	}
	void display() {
		System.out.println("Tên "+ten+", "+tuoi+" tuổi, "+gioiTinh);
	}
	public static void main(String[] args) {
		CongDung2 sv1 = new CongDung2("Huy", 21);
		sv1.display();	
	}
}
