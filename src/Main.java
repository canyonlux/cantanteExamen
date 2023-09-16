import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos nuevo objeto
        ListaCantantes lista = new ListaCantantes();

        int opcion = 0;
        //*******MENU*********
        while (opcion != 4) {
            System.out.println("1. Añade cantante\n2. Muestra cantantes\n3. Añadir un  disco a cantante\n4. Salir");
            opcion = sc.nextInt();
            //*******OPCIONES*********
            switch (opcion) {

                //añadiendo los atributos especificados añadimos nuevo cantante
                case 1:
                    System.out.println("Introduce nombre del cantante");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Introduce el año de inicio");
                    String anoInicio = sc.nextLine();
                    System.out.println("Introduce tipo de musica");
                    String tipoMusica = sc.nextLine();
                    System.out.println("Introduce sies grupo o no es: true/false");
                    boolean esGrupo = sc.nextBoolean();
                    Cantante cantante = new Cantante(nombre, anoInicio, tipoMusica, esGrupo);
                    lista.addCantante(cantante);
                    break;
                // recorre para obtener la informacion nombre,discos y num canciones
                case 2:
                    for (Cantante cantanteActual : lista.getListaCantantes()) {
                        System.out.println("Nombre: " + cantanteActual.getNombre());
                        System.out.println("Numero de discos: " + cantanteActual.getDiscos());
                        ArrayList<Disco> totalCanciones = cantanteActual.getDiscos();

                        System.out.println("Total de canciones: " + totalCanciones);
                    }
                    break;

                //seleccionamos cantante previamente creado y le adjudicamos un disco
                case 3:
                    System.out.println("Añade un nuevo disco a un cantante");
                    sc.nextLine();
                    String nombreCantante = sc.nextLine();
                    Cantante cantanteDisco = lista.getCantante(nombreCantante);
                    if (cantanteDisco != null) {
                        System.out.println("Introduce el titulo del disco");
                        String titulo = sc.nextLine();
                        System.out.println("Introduce año de publicación del mismo");
                        String anoPublicacion = sc.nextLine();
                        System.out.println("Introduce el numero de canciones del disco");
                        int numCanciones = sc.nextInt();
                        Disco disco = new Disco(titulo, anoPublicacion, numCanciones);
                        cantanteDisco.addDisco(disco);
                    } else {
                        System.out.println("Incorrecto");
                    }
                    break;
                case 4:
                    System.out.println("Salimos del programa");
                    break;

            }
        }

    }
}
