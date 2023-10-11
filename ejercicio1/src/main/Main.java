package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    Controlador c = new Controlador();
	    int desicion=10;
	    
	    do {
	    	
	    	
	    		System.out.println("--------------------------");
	    		System.out.println("Eliga una de las opciones: \n"
	    				+ "1. navegar\n"
	    				+ "2. retroceder\n"
	    				+ "3. obtener ubicacion actual\n"
	    				+ "0. para terminar");
	    		System.out.println("--------------------------");
	    		try {
	    			desicion=Integer.parseInt(sc.nextLine());
	    		}catch(Exception e) {
		    		System.out.println("entrada invalida");
		    		continue;
		    	}
	    		
	    		switch(desicion) {
	    		case 1: 
	    			c.navergar();
	    			break;
	    		case 2:
	    			c.retroceder();
	    			break;
	    		case 3:
	    			c.ubicacionActual();
	    			break;
	    		case 0:
	    			System.out.println("programa terminado");
	    			break;
	    		default:
	    			System.out.println("vuelva a ingresar un numero");
	    		}
	    		

	    }while(desicion!=0);
	    
	    
	}

}
