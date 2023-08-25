package test;

import domain.CompararClave;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:/Users/Lenovo/Desktop/prueba.txt");
            CompararClave.matcherAndPattern(archivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
