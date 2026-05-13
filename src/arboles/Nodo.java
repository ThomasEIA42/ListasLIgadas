package arboles;

public class Nodo<S> {
    S data;
    Nodo derecho;
    Nodo izquierdo;

    public Nodo(S data){
        this.data = data;
        izquierdo = null;
        derecho = null;
    }

}
