package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicio12 {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Introduce tu nombre");
        nombre = sc.next();
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();

        BufferedWriter out = null;
        try {
            out =  new BufferedWriter(new FileWriter("datos.txt", true));
            out.write(nombre);
            out.newLine();
            out.write(Integer.toString(edad));
            out.newLine();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        
    }
}
