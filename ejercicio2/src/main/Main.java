package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversion c = new Conversion();
		String n;
		do {
		
		System.out.println("digite un numero entero");
		String r=c.decimalABinario(sc.nextInt());
		System.out.println("El numero digitado en binario es: "+r);
		
		System.out.println("pulse N para ingresar otro numero. Cualquier otra tecla para terminar");
		n=sc.next();
		
		}while("N".equalsIgnoreCase(n));
		
		sc.close();
	}

}
