package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversion c = new Conversion();
		
		System.out.println("digite un numero decimal");
		String r=c.decimalABinario(sc.nextInt());
		System.out.println("El numero digitado en binario es: "+r);
		sc.close();

	}

}
