package listaLigada;

public class ListCircularDoble<P> {
    private NodoDoble<P> cabeza;
    private int tam;
    public void ListaCircularDoble() {
        this.tam = 0;
        this.cabeza = null;
    }
    //Metodo insertar al principio y al final
    public void insertar(P elemento) {
        NodoDoble<P> nuevo = new NodoDoble<>(elemento);
        if(cabeza == null) {
            cabeza = nuevo;
            cabeza.next = cabeza;
            cabeza.prev = cabeza;
        }
        else{
            NodoDoble<P> ultimo = cabeza.prev;
            nuevo.next = cabeza;
            nuevo.prev = ultimo;
            ultimo.next=nuevo;
            cabeza.prev = nuevo;
        }
        tam++;
    }
    //todo buscar, recorrr derecho y reves, eliminar, insertar cualquier pos

    public void recorrerDerecho() {
        if (cabeza == null) return;
        NodoDoble<P> actual = cabeza;
        do {
            System.out.print(actual.datos + " <-> ");
            actual = actual.next;
        } while (actual != cabeza);
        System.out.println("(Cabeza)");
    }

    public void recorrerReves() {
        if (cabeza == null) return;
        NodoDoble<P> actual = cabeza.prev;
        do {
            System.out.print(actual.datos + " <-> ");
            actual = actual.prev;
        } while (actual != cabeza.prev);
        System.out.println("(Final)");
    }
}


