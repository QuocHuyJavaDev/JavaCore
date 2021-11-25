
public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 15;
		int r = 4;
		
		int tong = tongHaiSo();
		System.out.println(tong);
		
		System.out.println((float)chiaHaiSo(x, y));
		
		helloWorld();
		
		double sHinhTron = soPi()*(r*r);
		System.out.println(sHinhTron);
	}
	public static int tongHaiSo() {
		int x = 10, y = 20;
		int tong = x + y;
		
		return tong;
	}
	//
	public static float chiaHaiSo (float x, float y) {
		float kq = x / y;
		
		return (float) kq;
	}
	//
	public static void helloWorld() {
		System.out.println("Hello world");
	}
	//
	public static double soPi() {
		return 3.14D;
	}
}
