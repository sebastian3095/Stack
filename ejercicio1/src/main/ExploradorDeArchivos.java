package main;

import java.util.Stack;

public class ExploradorDeArchivos {
    private Stack<String> historialAtras = new Stack<String>();
    private Stack<String> historialAdelante = new Stack<String>();
    private String ubicacionActual = "C:";

    public void navegarHacia(String nuevaUbicacion) {
        historialAtras.push(ubicacionActual);
        ubicacionActual = ubicacionActual+"\\"+nuevaUbicacion;
        historialAdelante.clear();
    }

    public void retroceder() {
        if (!historialAtras.isEmpty()) {
            historialAdelante.push(ubicacionActual);
            ubicacionActual = historialAtras.pop();
        }
    }

    public void avanzar() {
        if (!historialAdelante.isEmpty()) {
            historialAtras.push(ubicacionActual);
            ubicacionActual = historialAdelante.pop();
        }
    }

    public String obtenerUbicacionActual() {
        return ubicacionActual;
    }
    
}