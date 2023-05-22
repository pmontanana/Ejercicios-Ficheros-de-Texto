package Ejercicios;

import java.util.*;
import java.io.*;

public class Ejercicio11 {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        FileReader in = null;
        String texto = "";

        System.out.println("Escribe el nombre del archivo");
        nombre = sc.nextLine();
        if (nombre == ""){
            nombre = "prueba.txt";
        }
        try {
            in = new FileReader(nombre);
            int c = in.read();
            while(c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
