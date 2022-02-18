/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 * Codigo practico, GUI y Ficheros.
 * Universidad Catolica Santiago de Guayaquil.
 * @author PC
 */
public class ListaCircular {

    private Nodo p = null;

    public boolean listaVacia() {
        return p == null;
    }

    public Nodo recuperar() {
        return p;
    }

    public void insertarAlInicio(Persona persona) {
        Nodo nuevo = new Nodo();

        nuevo.setDato(persona);
        if (listaVacia()) {
            p = nuevo;
            p.setSiguiente(nuevo);
        } else {
            Nodo aux = p;

            while (aux.getSiguiente() != p) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(p);
            p = nuevo;
            aux.setSiguiente(p);

        }
    }

    public void insertarAlFinal(Persona persona) {
        Nodo aux = p;
        Nodo nuevo = new Nodo();
        nuevo.setDato(persona);

        if (listaVacia()) {

            p = nuevo;
            p.setSiguiente(nuevo);
        } else {
            while (aux.getSiguiente() != p) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(p);
        }
    }

    public int contadorDeNodos() {
        Nodo aux = p;
        int contador = 0;
        if (listaVacia()) {
            return contador;
        } else {
            while (aux.getSiguiente() != p) {
                contador++;
                aux = aux.getSiguiente();
            }
            return contador;
        }
    }

    public void eliminarAlInicio() {
        if (!listaVacia()) {
            Nodo aux = p;
            if (aux.getSiguiente() != p) {
                while (aux.getSiguiente() != p) {
                    aux = aux.getSiguiente();
                }
                p = p.getSiguiente();
                aux.setSiguiente(p);
            } else {
                p = null;
            }

        }
    }

    public void eliminarAlFinal() {
        if (!listaVacia()) {
            Nodo aux = p;
            if (aux.getSiguiente() != p) {
                while (aux.getSiguiente().getSiguiente() != p) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(p);
            } else {
                p = null;
            }

        }
    }

    public Nodo buscar(Persona persona) {
        Nodo aux = p;
        boolean encontrado = false;
        if (listaVacia()) {
            System.out.println("Lista Vacia");
        } else {
            do {
                if (persona == aux.getDato()) {
                    System.out.println("Buscaste a: " + aux.getDato());
                    encontrado = true;
                } else {
                    aux = aux.getSiguiente();
                }
            } while (aux != p);
        }
        if (encontrado) {
            return aux;
        } else {
            return null;
        }
    }

    public void mostrar() {

        Nodo aux = p;

        if (!listaVacia()) {
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.getSiguiente();

            }
        } else {
            System.out.println("Lista Vacia");
        }

    }

    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!listaVacia()) {
            // Crea una copia de la lista.
            Nodo aux = p;
            // Posicion de los elementos de la lista.
            int i = 0;
            System.out.print("-> ");
            // Recorre la lista hasta llegar nuevamente al incio de la lista.
            do {
                // Imprime en pantalla el valor del nodo.
                System.out.print("\n" + i + ".[ " + aux.getDato() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            } while (aux != p);
        }
    }
}
