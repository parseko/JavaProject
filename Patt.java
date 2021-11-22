package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patt {

    public static void main(String[] args) {
        File archivo = new File("/home/jesus/Escritorio/filename.txt");
        leerArchivo(archivo);

    }

    public static void leerArchivo(File archivo) {

        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String codigo;
            while ((codigo = leer.readLine()) != null) {
                Radi es = new Radi();
                es.escribir(archivo);
                Pattern pat = Pattern.compile("[a-z]+[A-Z]+[A-Z]+[a-z, A-Z, 0-9]+[a-z, A-Z, 0-9]");
                Matcher match = pat.matcher(codigo);
                if (match.matches()) {
                    System.out.println("Palabra: " + codigo);
                    System.out.println("Coincidencia");
                    leer.close();

                } else {

                    while (!match.matches()) {
                        System.out.println(codigo);
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Procesando");
                            System.out.println("");
                            Thread.sleep(800);
                        }
                        Thread.sleep(2000);

                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}