
package biblioteca;

public class Libro {
    
    private String titulo;
    private Autor autor;
    private int anio;
    private boolean favorito;
    
    public Libro(String titulo, Autor autor, int anio, boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }
    
     public Libro(String titulo, Autor autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        
    }

  

    @Override
    public String toString() {
        return "Libro" + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAño: " + anio ;
    }
    
    
 
    
    
}
