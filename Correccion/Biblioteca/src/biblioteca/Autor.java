
package biblioteca;

import java.util.Arrays;
import java.util.Objects;

public class Autor {
 private String nombre;
    private String pais;
    private Libro[] libro;
    
   

    public Autor(String nombre, String pais, Libro[] libro) {
        this.nombre = nombre;
        this.pais = pais;
        this.libro = libro;
    }

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    Autor(Autor listaAutore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.pais);
        hash = 59 * hash + Arrays.deepHashCode(this.libro);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Arrays.deepEquals(this.libro, other.libro)) {
            return false;
        }
        return true;
    }

    
  

   

    @Override
    public String toString() {
      String b="Autor{" + "nombre=" + nombre + ", pais=" + pais ;
      for(int i=0;i<10;i++ ){
          b += "\nLibro"+ libro[i];
      }  
      return b ;
    }

    
    
    
}
