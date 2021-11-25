package MangBasic;

import java.util.Scanner;

public class Timkiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mang1 = new int[5];
		//Nhap mang
		for (int i = 0; i < mang1.length; i++) {
			System.out.print("Nhap mang tai vi tri "+i+": ");
			mang1[i] = sc.nextInt();
		}
		//Xuat mang
		System.out.print("Cac phan tu cua mang la: ");
		for (int i = 0; i < mang1.length; i++) {
			System.out.print(mang1[i]+", ");
		}
		//Tim kiem
		int k;
		System.out.print("\nNhap so can tim kiem: "); k = sc.nextInt();
		System.out.print("So can tim o vi tri: ");
		for (int i = 0; i < mang1.length; i++) {
			if (k==mang1[i]) {
				System.out.print(i+" ");
			}
		}
		//Tim so lon nhat
		int sln = mang1[0];
		for (int i = 0; i < mang1.length; i++) {
			if (sln < mang1[i]) {
				sln = mang1[i];
			}
			}
		System.out.println("\nSo lon nhat la: "+sln);
		//sap xep tang dan
		int temp = mang1[0];
		for (int i = 0; i < mang1.length-1; i++) {
			for (int j = i+1; j < mang1.length; j++) {
				if (mang1[i] > mang1[j]) {
					temp = mang1[j];
					mang1[j] = mang1[i];
					mang1[i] = temp;
				}
			}
		}
		System.out.print("mang sau khi sap xep:");
		for (int i = 0; i < mang1.length;i++) {
			System.out.print(mang1[i]+" ");
		}
		}
		
	}


