
package biblioteca;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
      
         Scanner scan= new Scanner(System.in);
         System.out.println("###MENU###");
         System.out.println("Ingrese las siguientes opciones");
         System.out.println("1. Ingresar un nuevo libro a la biblioteca");
         System.out.println("2. Imprimir lista de libros favoritos");
         System.out.println("3. Contar lista libros de autor");
         int menu=scan.nextInt();
         int contadorLibros=0;
         int contadorFavorito=0;
         
         Libro[] listaLibros=new Libro[10];
         Libro[] listaLibrosFavoritos=new Libro[10];
         Biblioteca[] autorYLibros=new Biblioteca[10];
         boolean favorito=false;
          switch(menu){
              case 1:
                  if(contadorLibros<=10){
                  System.out.println("Ingresar un nuevo libro");
                  
                  System.out.println("Ingres el tiulo del libro:");
                  String titulo=scan.nextLine();
                  
                  System.out.println("Ingrese la informacion del autor:");
                  
                  
                  System.out.print("Nombre del autor:");
                  String nombre=scan.nextLine();
                  
                  System.out.print("Pais del autor:");
                  String pais=scan.nextLine();
                  
                  
                  
                  
                  Autor autor=new Autor(nombre, pais);
                  
                  System.out.println("Ingrese el año del libro:");
                  int anio=scan.nextInt();
                  
                  System.out.println("Este libro es tu favorito \n1. Si  \n2. No ");
                  int siOno=scan.nextInt();
                  do{
                      if(siOno==1){
                          favorito=true;
                      }if(siOno==2){
                          favorito=false;
                      }else{
                          System.out.println("Opcion incorrecta");
                      }
                      
                  }while(siOno!=2);
                  
                    
                  Libro libros=new Libro(titulo, autor, anio, favorito);
                  
                  if(favorito=true){
                  Libro libro=new Libro( titulo, autor, anio);
                  listaLibrosFavoritos[contadorFavorito]=libro;
                      contadorFavorito++;
                  }
                  
                  listaLibros[contadorLibros]=libros;
                  
                  Biblioteca biblioteca =new Biblioteca(libros,autor);
                  autorYLibros[contadorLibros]=biblioteca;
                  
                    contadorLibros++;   
                    
                    favorito=false;
                  }else{
                      System.out.println("Biblioteca llena");
                      break;
                  }       
                  break;
              case 2: 
                  System.out.println("Imprimir lista de libros favoritos");
                  if(contadorFavorito==0){
                      System.out.println("No hay libros en la lista de favoritos");  
                      break;
                  }
                  System.out.println("Lista de favoritos");
                  
                     for(int i=0; i<listaLibrosFavoritos.length;i++){
                         System.out.println("Libros:"+(i+1)+listaLibrosFavoritos[i]);   
                     } 
                 
                  
                  break;
              case 3:
                  
                  
                  break;
              default:
                  System.out.println("Opcion imcorrecta");
                  break;
          }  
         
         
    
}
     }