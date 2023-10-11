package main;

import java.util.Scanner;

public class Controlador {
	private ExploradorDeArchivos explorador = new ExploradorDeArchivos();
	
	public void navergar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("Digite el nombre de la carpeta destino: ");
		System.out.println("--------------------------");
		explorador.navegarHacia(sc.next());
	}
	
	public void retroceder() {
		explorador.retroceder();
		System.out.println("--------------------------");
		System.out.println("retroceso con exito");
		System.out.println("--------------------------");
	}
	
	public void ubicacionActual() {
		System.out.println("--------------------------");
		System.out.println("la ubicacion actual es: "+explorador.obtenerUbicacionActual());
		System.out.println("--------------------------");
	}
	
}
