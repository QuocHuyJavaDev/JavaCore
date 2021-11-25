package VongLap;

import java.util.Iterator;

public class CauLenhBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		}
		// break chỉ có tác dụng trong vòng lặp mà nó nằm trong
		System.out.println("-----------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println("Gia tri cua i = "+i);
			for (int j = 0; j < 10; j++) {
				System.out.println("Gia tri cua j = "+j);
				if (j<5) {
					break;	
				}
				
			}
		}
	}

}
