import java.util.ArrayList;

public class Cantante {

    //atributos
    private String nombre;
    private String anoComienzo;
    private String tipoMusica;
    private boolean esGrupo;
    private ArrayList<Disco> discos;

    //constructor
    public Cantante(String nombre, String anoComienzo, String tipoMusica, boolean esGrupo) {
        this.nombre = nombre;
        this.anoComienzo = anoComienzo;
        this.tipoMusica = tipoMusica;
        this.esGrupo = esGrupo;
        this.discos = new ArrayList<>();
    }
//getters setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnoComienzo(String anoComienzo) {
        this.anoComienzo = anoComienzo;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public void setEsGrupo(boolean esGrupo) {
        this.esGrupo = esGrupo;
    }

    public void setDiscos(ArrayList<Disco> discos) {
        this.discos = discos;
    }

    public String getAnoComienzo() {
        return anoComienzo;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public boolean getEsGrupo() {
        return esGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", anoComienzo=" + anoComienzo + ", tipoMusica=" + tipoMusica + ", esGrupo=" + esGrupo + ", discos=" + discos + '}';
    }

//metodo para añadirle un disco.

    public void addDisco(Disco disco) {
        this.discos.add(disco);
    }
}
