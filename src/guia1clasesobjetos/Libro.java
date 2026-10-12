
package guia1clasesobjetos;


public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaActual;
    
    public Libro(String titulo, String autor, int numeroDePaginas, int paginaActual){
        this.autor = autor;
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaActual = paginaActual;
          
      
    }
    
    public void avanzarPagina(int cantidad){
        paginaActual += cantidad;
    }
    
    public void retrocederPagina(int cantidad){
        paginaActual -= cantidad;
    }
    
    public boolean estaTerminado(){
        return paginaActual >= numeroDePaginas;
    }
    
    public int mostrarPagina(){
        return paginaActual;
    }
    
}
