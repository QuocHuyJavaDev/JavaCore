package BaiTap1;

public class Bai8Trang45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai8Trang45 c = new Bai8Trang45();
		c.go();
	}
	void go() {
		int y = 7;
		for (int x = 1; x < 8; x++) {
			y++;
			if (x > 4) {
				System.out.print(++y+" ");
			}
			if (y > 14) {
				System.out.println("\nx = "+x);
				break;
			}
		}
	}

}
//x = 1, y = 8
/* 
*x = 2 y = 9
*x = 3 y = 10
*x = 4 y = 11
*
*x = 5 y = 13
*x = 6 y = 15
*x = 7 y = 17
*/