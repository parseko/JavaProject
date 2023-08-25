package domain;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompararClave {
    public static String clave;

    public static String leerArchivo(File archivo) {
        try {
            CrearArchivo.escribir(archivo);
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            CompararClave.clave = leer.readLine();
            leer.close();
            return clave;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void  matcherAndPattern(File archivo) {
        try {
            do {
                CompararClave.clave = leerArchivo(archivo);
                Pattern pattern = Pattern.compile("[a-z]+[A-Z]+[A-Z]+[a-z, A-Z, 0-9]+[a-z, A-Z, 0-9]");
                Matcher matcherCiclo = pattern.matcher(CompararClave.clave);
                mensajesEnConsolaConHilos(CompararClave.clave);
                if (matcherCiclo.matches()) {
                    System.out.println("Palabra: " + CompararClave.clave);
                    System.out.println("Coincidencia");
                    break;
                }
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mensajesEnConsolaConHilos(String clave) {
        try {
            System.out.println("clave = " + clave);
            for (int i = 0; i < 5; i++) {
                System.out.println("Procesando");
                System.out.println("");
                Thread.sleep(800);
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
