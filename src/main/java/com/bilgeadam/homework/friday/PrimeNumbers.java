package com.bilgeadam.homework.friday;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		System.out.println("Lütfen bir sayý giriniz: ");
		Scanner klavye = new Scanner(System.in);
		int sayi = klavye.nextInt();
		int sayac = 0;
		if (sayi < 1) {
			System.out.println("Sadece '1' den buyuk sayilar, asal sayi olabilir!");
		} else {
			for (int i = 1; i <= sayi; i++) {
				int kalan = sayi % i;
				if (kalan == 0) {
					sayac++;
				}
			}
			if (sayac == 2) {
				System.out.println("Sayi asaldir");
			} else {
				System.out.println("Sayi asal degildir");
			}
			klavye.close();
		}
		
	}
	
}