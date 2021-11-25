	package MangBasic;

public class Mangbacsic {
	public static void main(String[] args) {
		//cách 1
		int[] mangA = new int[3];
		mangA[0] = 4;
		mangA[1] = 5;
		mangA[2] = 2;
		System.out.println(mangA[1]);
		
		System.out.println("=================================");
		//Cách 2
		String[] mangB = {"A", "4", "C"};
		System.out.println(mangB[0]+mangB[2]);
		System.out.println(mangB.length);
	}
}
