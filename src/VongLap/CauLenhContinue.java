package VongLap;

public class CauLenhContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bỏ qua vòng lặp ko thoả 
		for (int i = 0; i < 10; i++) {
			if (i > 5) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
	