
package biblioteca;
import java.util.Scanner;

public class Biblioteca {

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
         int contadorAutores=0;
         
         Libro[] listaLibros=new Libro[10];
         Libro[] listaLibrosFavoritos=new Libro[10];
         Autor[] listaAutores=new Autor[10];
         boolean favorito=false;
         Contador[] contador=new Contador[10];
         do{ 
         switch(menu){
              case 1:
                  if(contadorAutores<=10){
                  System.out.println("Ingresar un nuevo libro");
                  
                  System.out.println("Ingrese el tiulo del libro:");
                  String titulo=scan.nextLine();
                  
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
                      System.out.println("Autor:");
                  
                     
                      System.out.println("No existen autores registrados ");
                      System.out.println("Ingrese la informacion del autor:");
                  
                  
                      System.out.print("Nombre del autor:");
                      String nombre=scan.nextLine();
                  
                      System.out.print("Pais del autor:");
                      String pais=scan.nextLine();
                      
                      
                     
                  
                     
                  
                      
                      
                                  
                  if(favorito=true){
                  Libro libro=new Libro( titulo, anio);
                  listaLibrosFavoritos[contadorFavorito]=libro;
                      contadorFavorito++;
                  }
                  
                  Libro libros=new Libro(titulo, anio);
                  
                  listaLibros[contadorLibros]=libros;
                  
                 Autor autor=new Autor(nombre, pais, listaLibros );
                  
                    contadorAutores++;   
                    
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
                  contadorLibros=0; 

                    favorito = true;
                     for(int i=0;i<10;i++){
                         for(int j=0;j<10;j++){
                          if(listaAutores[i].equals(listaAutores[j])){
                            
                           contadorLibros++; 
                         }
                         }
                        Autor  aut= new Autor(listaAutores[i]);  
                       contador[i]=new Contador(aut, contadorLibros); 
                     }
                         
                         for(int j=0;j<10;j++){
                             System.out.println("Libro"+contador[j]);
                         }
                      
                     
                      
                  
                  break;
                  
                  case 4:
                  System.out.println("Adios");
                  
                  break;
                  
         }    
            
          } while(menu!=3);
        
        
    }
    
}
