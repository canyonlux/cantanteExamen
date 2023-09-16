import java.util.ArrayList;

public class ListaCantantes {

    //creamos el arraylist para añadir cantantes
    private ArrayList<Cantante> listaCantantes;

    //constructor
    public ListaCantantes() {
        this.listaCantantes = new ArrayList<>();
    }

    //getters/setters
    public void setListaCantantes(ArrayList<Cantante> listaCantantes) {
        this.listaCantantes = listaCantantes;
    }

    public ArrayList<Cantante> getListaCantantes() {
        return listaCantantes;
    }
    //*******METODOS******

    //metodo para añadir cantante
    public void addCantante(Cantante cantante) {
        this.listaCantantes.add(cantante);
    }

    //metodo recuperar cantante a partir de su nombre
    public Cantante getCantante(String nombre) {
        for (Cantante cantante : this.listaCantantes) {
            if (cantante.getNombre().equals(nombre)) {
                return cantante;
            }
        }
        return null;
    }
//recuperar posicion por nombre del cantante

    public int getCantantePosicion(String nombre) {
        for (int pos = 0; pos < this.listaCantantes.size(); pos++) {
            if (this.listaCantantes.get(pos).getNombre().equals(nombre)) {
                return pos;
            }
        }
        return -1;
    }
// borrar cantante a partir de su nombre

    public void deleteCantante(String nombre) {
        int pos = getCantantePosicion(nombre);
        if (pos != -1) {
            this.listaCantantes.remove(pos);
        }
    }

}
