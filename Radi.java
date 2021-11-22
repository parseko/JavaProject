package src;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Radi {

    public void escribir(File archivo) {
        try {
            int longitud = 5;
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            // Si el archivo no existe es creado
            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            bw.write(cadenaAleatoria(longitud));
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String cadenaAleatoria(int longitud) {
        String ascii = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
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