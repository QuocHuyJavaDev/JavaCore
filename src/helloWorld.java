import ChuViDienTich.HinhChuNhat;
public class helloWorld {
	/**
	 * 
	 * @param args
	 */
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println(ChuViDienTich.HinhChuNhat.chuVi(2, 3));
		//sysout
		System.out.println("Hello world");
		
		//boolean
		boolean bo = true;
		System.out.println(bo);
		// byte- 8 bit - [-2^7;(2^7)-1] gtmd = 0
		byte by = 127;
		System.out.println(by);
		//short - 16bit - [-2^15;(2^15)-1] gtmd = 0
		short sho = 12345;
		System.out.println(sho);
		//interger - 32 bit - [-2^31;(2^31)-1] gtmd = 0
		int in = 232332;
		System.out.println(in);
		int in1 = 0x2A;
		System.out.println(in1);
		//long - 64bit - [-2^63;(2^63)-1]
		long lon = -23232434;
		System.out.println(lon);
		
		//float - 32 bit 
		float fl = 2.3454f;
		System.out.println(fl);
		//double - 64 bit
		double db = 2.334324d;
		System.out.println(db);
		
		//char - unicode 16 bit - unicode 0 -> 2^16-1
		char let1 = 65;
		System.out.println(let1);
		char let2 = '9';
		System.out.println(let2);
		char let3 = 'B';
		
		//String
		String a = "Le Quoc Huy";
		System.out.println(a);
		
		//0x he thap luc phan
		int  hex = 0x35;
		System.out.println(hex);
		//0d he nhi phan
		int binary = 0b10101;
		System.out.println(binary);
		
		//hang so - khai bao nhuw bien nhung co them FINAL
		final int HS = 100;
		System.out.println(HS);
		int bien = 100;
		System.out.println(bien);
		bien = 200;
		System.out.println(bien);
	}
}
