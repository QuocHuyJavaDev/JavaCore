//GỌi phương thức của lớp
package ThisInJava;

public class COngDung3 {
	void ten() {
		System.out.println("Huy");
	}
	void tuoi() {
		this.ten();
		System.out.println("18 tuổi");
	}
	public static void main(String[] args) {
		COngDung3 sv1 = new COngDung3();
		sv1.tuoi();
	}
}
