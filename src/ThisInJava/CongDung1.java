//Tham chiếu đến biến instance của lớp hiện tại
// nếu biến cục bộ và biến toàn cục có tên khác nhau thì không cần dùng this
package ThisInJava;

public class CongDung1 {
	String ten; //instance variable
	int tuoi;
	CongDung1(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
				
	}
	void display() {
		System.out.println("Em tên "+ten+", "+tuoi+" tuổi.");
	}
	public static void main(String[] args) {
		CongDung1 sv1 = new CongDung1("Huy", 21);
		CongDung1 sv2 = new CongDung1("Minh", 20);
		
		sv2.display();
		sv1.display();
	}
}
