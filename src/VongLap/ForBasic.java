package VongLap;

import java.util.Iterator;

public class ForBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in ra số nguyên dương nhỏ hơn 10 và chia hết cho 2
		for (int i = 1; i < 10; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("========================");
		// in ra bảng cửu chương
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			System.out.println("------------");
		}
		
	}

}
