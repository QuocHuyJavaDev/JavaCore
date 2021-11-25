package VongLap;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert n = "); int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(fibo(i)+" ");
		}

	}
	public static int fibo(int n) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;
		if (n < 0) {
			return -1;
		} else if(n==1 || n==0) {
			return n ;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f1+f0;
			}
		}
		return fn;
	}
}
