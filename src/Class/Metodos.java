package Class;

import java.util.ArrayList;
import java.util.Scanner;
public class Metodos {

    Nodo Ultimo;
    Nodo Inicio;
    int  tamaño;
    ArrayList Lista = new ArrayList<Integer>();

    public Metodos() {
        Ultimo = null;
        Inicio = null;
    }

    public boolean Vacia() {
        return Ultimo == null;
    }

    public void AgregarSoldado(String name) {

        Nodo nuevo = new Nodo();

        nuevo.setNombre(name);

        if (Vacia()) {

            Inicio = nuevo;

            Ultimo = nuevo;

            Ultimo.setSiguiente(Inicio);

        } else {

            Ultimo.setSiguiente(nuevo);

            nuevo.setSiguiente(Inicio);

            Ultimo = nuevo;
        }
        tamaño = tamaño + 1;
        nuevo.posicion = tamaño;
        Lista.add(nuevo.getPosicion());
    }

    public void Jose(Nodo aux, int n) {
        Nodo r = aux;
        System.out.println("SOLDADOS :");
        listar();
        System.out.println(" ");
        while (aux.siguiente != aux) {
            int i = 1;
            while (i < n) {
                r = r.siguiente;
                i++;

            }
            System.out.println(" ");
            System.out.println("SOLDADO A ELIMINAR :" + r.getNombre());

            if (r == aux) {

                Nodo k = aux;

                while (k.siguiente != aux) {
                    k = k.siguiente;
                }

                aux = r.siguiente;

                k.siguiente = aux;

                r = k.siguiente;

            } else {

                Nodo k = aux;

                while (k.siguiente != r) {
                    k = k.siguiente;
                }
                k.siguiente = r.siguiente;

                r = k.siguiente;

            }

        }
        System.out.println("EL SOLDADO QUE  SE SALVA ES  :" + r.getNombre());
    }

    public void listar() {

        if (!Vacia()) {

            Nodo aux = Inicio;
            int i = 0;
            System.out.print("-> ");
            do {
                System.out.print("[" + aux.getNombre() + "]" + " -> ");

                aux = aux.getSiguiente();
                i++;
            } while (aux != Inicio);
        }
    }

}
