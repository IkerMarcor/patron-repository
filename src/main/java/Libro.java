package main.java;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;

    public Libro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    //getter isbn
    public int getIsbn(){
        return this.isbn;
    }

    //getter titulo
    public String getTitulo(){
        return this.titulo;
    }

    //getter autor
    public String getAutor(){
        return this.autor;
    }

    //setter isbn
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    //setter titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //setter autor
    public void setAutor(String autor){
        this.autor = autor;
    }
}
