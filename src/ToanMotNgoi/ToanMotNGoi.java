package ToanMotNgoi;

public class ToanMotNGoi {
	public static void main(String[] args) {
		int a = 10;
		boolean b = true;
		//
		System.out.println("a = "+a);
		System.out.println("-a = "+(-a));
		//lấy nghịch đảo của giá trị boolean
		System.out.println("!b = "+ (!b));
		//
		System.out.println("=================================");
		//++a => tăng a lên 1 đon vị rồi mới thực thi đoạn code
		System.out.println("++a = "+ (++a));
		//a++ => tăng a lên 1 đơn vị sau khi thực hiện đoạn code
		System.out.println("a++ = "+ (a++));
		System.out.println("a sau khi tang a++ = "+a);
	}
}
