package com.bilgeadam.main.examples;

import java.util.Scanner;

/*
 * 80<=hiz<=85 ==>Hýzlý gidiyorsunuz lütfen yavaþlayýnýz: 200TL erken öderseniz
 * % 15 indirim alacaksýnýz.
 * 85<=hiz<=100 ==>Çok hýzlý gidiyorsunuz lütfen yavaþlayýn: 300 TL %15 indirim
 * 100<=hýz ==> Ehliyetinize el konuldu.1000 TL
 */

public class Examples_004_Radar {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen hýz giriniz: ");
		int hiz = klavye.nextInt();
		double para = 0;
		if ((80 <= hiz) && (hiz <= 85)) {
			System.out.println("Hýzlý gidiyorsunuz lütfen yavaþlayýn");
			para = 200;
			para = para - (para * (15.0 / 100.0));
			System.out.println("Cezanýz: 200 TL eðer erken öderseniz %15 indirim alacaksýnýz ");
		} else if ((85 < hiz) && (hiz <= 100)) {
			System.out.println("Çok hýzlý gidiyorsunuz lütfen yavaþlayýn");
			para = 300;
			para = para - (para * (15.0 / 100.0));
			System.out.println("Cezanýz: 300 TL eðer erken öderseniz %15 indirim alacaksýnýz ");
		} else if (hiz > 100) {
			System.out.println("hýzýnýz: " + hiz + "ehliyetinize el konulacaktýr");
			para = 1000;
			System.out.println("Cezanýz: 1000 TL eðer erken öderseniz %15 indirim alacaksýnýz ");
		}
		klavye.close();
	}
	
}
