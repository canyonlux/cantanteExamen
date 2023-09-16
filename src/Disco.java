public class Disco {

    //atributos solicitados
    private String titulo;
    private String anoPublicacion;
    private int numCanciones;
// constructor

    public Disco(String titulo, String anoPublicacion, int numCanciones) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.numCanciones = numCanciones;
    }
//getter/setters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnoPublicacion() {
        return anoPublicacion;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    @Override
    public String toString() {
        return "Disco{" + "titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + ", numCanciones=" + numCanciones + '}';
    }

}
