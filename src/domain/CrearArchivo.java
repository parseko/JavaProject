package domain;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;


public class CrearArchivo {
    private final static int LONGITUD = 5;
    public static void escribir(File archivo){
        try {
            FileWriter escribirEnArchivo = new FileWriter(archivo);
            BufferedWriter escribirEnBuffer = new BufferedWriter(escribirEnArchivo);

            if(!archivo.exists()){
                archivo.createNewFile();
            }
            escribirEnBuffer.write(cadenaAleatoria());
            escribirEnBuffer.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String cadenaAleatoria() {
        String ascii = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String cadena = "";
        for (int x = 0; x < CrearArchivo.LONGITUD; x++) {
            int indice = numeroAleatorio(0, ascii.length() - 1);
            char caracter = ascii.charAt(indice);
            cadena += caracter;
        }
        return cadena;
    }

    public static int numeroAleatorio(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
