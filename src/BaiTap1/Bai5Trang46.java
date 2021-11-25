package BaiTap1;

public class Bai5Trang46 {
	static int n = 1;
	static int sum = 0;
	//
	public static  int WhileLoop () {
		while (n <= 10) {
			sum += n;
			n++;
		}
		return sum;
		
	}
	//
	public static int ForLoop() {
		for (int i = n; i <= 10; i++) {
			sum +=i ;
		}
		return sum;
	}
	//
	public static int DoWhileLoop() {
		do {
			sum+=n;
			n++;
		} while (n <= 10);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do while loop
		System.out.println("Do While loop sum = "+DoWhileLoop());
		//while loop
		
		System.out.println("While loop sum = "+WhileLoop());
		
		// for loop
		System.out.println("For loop sum = "+ForLoop());
		
		
		
	}

}
