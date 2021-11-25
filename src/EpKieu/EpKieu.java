package EpKieu;

public class EpKieu {
	public static void main(String[] args) {
		int a = 100, b = 10;
		//ep kieu ngam dinh
		float c = a, d = b;
		System.out.println("c = "+c+", d = "+d);
		//ep kieu tuong minh
		float x = 4.5f, y = 9.2f;
		int g = (int) x, h = (int) y;
		System.out.println("g = "+g+", h = "+h);
		//ep giua bien nguyen thuy va doi tuong
		int z = new Integer(a);
		System.out.println(z);
	}
}
