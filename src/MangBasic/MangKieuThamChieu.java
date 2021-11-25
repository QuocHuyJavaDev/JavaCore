package MangBasic;

public class MangKieuThamChieu {
	String name;
	public void goiPhatBieu() {
		System.out.println(name+", phát biểu cho cô biết.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MangKieuThamChieu std1 = new MangKieuThamChieu();
		std1.name = "Huy";
		
		
		MangKieuThamChieu [] stds = new MangKieuThamChieu[3];
		stds[0] = std1;
		stds[1] = new MangKieuThamChieu();
		stds[2] = new MangKieuThamChieu();
		
		stds[1].name = "Long";
		stds[2].name = "Ming";
		
		int n = 0;
		while(n < stds.length) {
			stds[n].goiPhatBieu();
			n++;
		}
	}
	
}
