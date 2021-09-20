package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_006_GirilenKarakterCinsi {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		boolean isResult=true;
		while(isResult) {
		
		System.out.print("\nLütfen bir karakter giriniz: ");
		String simge;
		simge = klavye.nextLine();
		char karakter = simge.charAt(0);
		
		if (Character.isDigit(karakter)) {
			System.out.print("Bir sayýdýr");
		}else if (Character.isLetter(karakter)) {
			System.out.print("Bir harftir");
		}else {
			System.out.print("Özel Simgedir");
		}
		klavye.close();
		
		
		
	}
	
}
}