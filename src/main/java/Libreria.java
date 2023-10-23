package main.java;

import java.util.Hashtable;
import java.util.Map;

public class Libreria {
    public static void main(String[] args){
        //creamos la libreria
        Map<Integer,Libro> libreria = new Hashtable<Integer,Libro>();

        //Creamos los libros (c)
        Libro libro1 = new Libro(1564, "De la tierra a la luna", "Julio Verne");
        Libro libro2 = new Libro(1594, "Sapiens", "Yuval Noah Harari");

        //Añadimos libros a la libreria (c)
        libreria.put(libro1.getIsbn(), libro1);
        libreria.put(libro2.getIsbn(), libro2);

        //consultamos nuestra libreria (r)
        for (Map.Entry<Integer, Libro> libro : libreria.entrySet()) {
            int id = libro.getKey();
            Libro x = libro.getValue();
            System.out.println("Libro "+id+":");
            System.out.println(x.getAutor()+", "+x.getTitulo());
            System.out.println("------------------------");
        }

        //actualizamos el registro (u)
        libro2.setAutor("Alfredo Vizcarra");
        libro2.setTitulo("El santo");

        //volvemos a consultar(r)
        for (Map.Entry<Integer, Libro> libro : libreria.entrySet()) {
            int id = libro.getKey();
            Libro x = libro.getValue();
            System.out.println("Libro "+id+":");
            System.out.println(x.getAutor()+", "+x.getTitulo());
            System.out.println("------------------------");
        }

        //eliminar registro(d)
        libreria.remove(1594);

        //volvemos a consultar(r)
        for (Map.Entry<Integer, Libro> libro : libreria.entrySet()) {
            int id = libro.getKey();
            Libro x = libro.getValue();
            System.out.println("Libro "+id+":");
            System.out.println(x.getAutor()+", "+x.getTitulo());
            System.out.println("------------------------");
        }

    }
}
