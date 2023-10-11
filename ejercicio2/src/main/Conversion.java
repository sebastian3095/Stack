package main;
import java.util.Stack;
public class Conversion {
	
	public String decimalABinario(int numero) {
        Stack<Integer> pila = new Stack<Integer>();
        while (numero > 0) {
            pila.push(numero % 2);
            numero /= 2;
        }
        StringBuilder binario = new StringBuilder();
        while (!pila.isEmpty()) {
            binario.append(pila.pop());
        }
        return binario.toString();
    }
	
	
	
}
