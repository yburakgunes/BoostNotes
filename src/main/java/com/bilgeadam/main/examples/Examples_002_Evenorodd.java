package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_002_Evenorodd {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		while(true) {
			System.out.println("Lütfen bir sayý giriniz");
		int sayi = klavye.nextInt();
		if (sayi==-1) {
			System.out.println("Sistemden çýkýþ saðlanýyor ...");
			System.exit(0);
		} else {
		
		if (sayi >= 0) {
			if (sayi % 2 == 0) {
				System.out.println("Çift Sayýdýr");
			} else {
				System.out.println("Tek Sayýdýr");
			}
		} else {
			System.out.println("Negatif sayý girdiniz. Lütfen pozitif sayý giriniz. ");
		}
		
		}
		klavye.close();
		}
	}
}