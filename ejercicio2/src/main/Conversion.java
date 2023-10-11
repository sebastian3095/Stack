package main;
import java.util.ArrayDeque;
public class Conversion {
	
	public String decimalABinario(int numero) {
        ArrayDeque<Integer> cola = new ArrayDeque<Integer>();
        if(numero==0)return "0";
        while (numero > 0) {
        	cola.addFirst(numero%2);
            numero /= 2;
        }
        StringBuilder binario = new StringBuilder();
        while (!cola.isEmpty()) {
            binario.append(cola.poll());
        }
        return binario.toString();
    }
	
	
	
}
