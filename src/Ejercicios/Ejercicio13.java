package Ejercicios;
import java.util.*;
import java.io.*;

public class Ejercicio13 {
    public static void leeArchivo(String archivo, ArrayList<Integer> lista){
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(archivo));
            String linea = in.readLine();
            while(linea != null) {
                lista.add(Integer.parseInt(linea));
                linea = in.readLine();
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
    } 

    public static void escribirArchivo(String archivo, ArrayList<Integer> lista){
        BufferedWriter out = null;
        try {
            out =  new BufferedWriter(new FileWriter(archivo));
            for(Integer i: lista){
                out.write(Integer.toString(i));
                out.newLine();
            }

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

    public static void exec(){
        ArrayList<Integer> lista = new ArrayList<Integer>(); 
        leeArchivo("lista1.txt", lista);
        leeArchivo("lista2.txt", lista);
        Collections.sort(lista);
        escribirArchivo("lista3.txt", lista);
    }
}
