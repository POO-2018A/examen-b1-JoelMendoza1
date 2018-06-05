/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Objects;

/**
 *
 * @author ESFOT
 */
public class Biblioteca {

   private Libro libros;
   private Autor autor;
   private int contador;

    public Biblioteca(Libro libros, Autor autor) {
        this.libros = libros;
        this.autor = autor;
        
        
       
    }

    public Libro getLibros() {
        return libros;
    }

    public void setLibros(Libro libros) {
        this.libros = libros;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        contador++;
        return true;
    }



   
   
   
   
    
}
