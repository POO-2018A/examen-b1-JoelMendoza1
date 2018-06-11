
package biblioteca;


public class Contador {
 private Autor autor;
 private int contador;

    public Contador(Autor autor, int contador) {
        this.autor = autor;
        this.contador = contador;
    }

    @Override
    public String toString() {
         
      
      String  b= "Autor=" + autor + "\nContador="+contador;
        return b;
        
       
    }
 
}
