package arboles;

public class Arbol<M extends Comparable<M>> {
    private Nodo<M> raiz;

    //todo
    //1. inicializar el arbol
    //2. insertar
    //Recorridos preorden inorden postorden
    //3. elimiar
    //4. buscar

        public Arbol() {
            this.raiz = null;
        }
        public void insertar(M valor) {
            this.raiz = this.insertarRecursivo(raiz, valor);

        }
        public Nodo<M> insertarRecursivo(Nodo<M> nodoactual, M valor){
            if(nodoactual == null){
                return new Nodo<>(valor);
            }
            if(valor.compareTo(nodoactual.data)<0){
                nodoactual.izquierdo = insertarRecursivo
                        (nodoactual.izquierdo, valor);
            } else if(valor.compareTo(nodoactual.data)>0) {
                nodoactual.derecho=insertarRecursivo(nodoactual.derecho, valor);

            }
            return nodoactual;
        }

        public void recorridoPreorden(){
            System.out.println("Recorrido Preorden");
            recorridoPreOrdenRecursivo(this.raiz);
            System.out.println();
            System.out.println("Recorrido Preorden terminado");

        }

        public void recorridoPreOrdenRecursivo(Nodo<M> actual){
            if(actual!= null){
                System.out.print(actual.data);
                recorridoPreOrdenRecursivo(actual.izquierdo);
                recorridoPreOrdenRecursivo(actual.derecho);
            }
        }
        public void recorridoInorden(){
            System.out.println("Recorrido Inorden");
            recorridoInOrdenRecursivo(this.raiz);
            System.out.println();
            System.out.println("Recorrido Inorden terminado");
        }
        public void recorridoInOrdenRecursivo(Nodo<M> actual){
            if(actual!= null){
                recorridoInOrdenRecursivo(actual.izquierdo);
                recorridoInOrdenRecursivo(actual.derecho);
                System.out.print(actual.data);
            }
        }
        public void recorridoPostorden(){
            System.out.println("Recorrido Postorden");
            recorridoPostOrdenRecursivo(this.raiz);
            System.out.println();
            System.out.println("Recorrido Postorden terminado");
        }
        public void recorridoPostOrdenRecursivo(Nodo<M> actual){
            if(actual!= null){
                recorridoPostOrdenRecursivo(actual.izquierdo);
                recorridoPostOrdenRecursivo(actual.derecho);
            }
        }
        private M  encontrarMinimo(Nodo<M> nodoactual){
            M min=nodoactual.data;
            while (nodoactual.izquierdo!=null){

                nodoactual=nodoactual.izquierdo;
                min=nodoactual.data;

            }
            return min;
        }
        public void eliminar(M valor){
            this.raiz = this.eliminarRecursivo(raiz, valor);
        }
        private Nodo<M> eliminarRecursivo(Nodo<M> nodoactual, M valor){

            if(nodoactual==null){
                return null;
            }else if(valor.compareTo(nodoactual.data)<0){
                nodoactual.izquierdo=eliminarRecursivo(nodoactual.izquierdo, valor);
            }else if(valor.compareTo(nodoactual.data)>0){
                nodoactual.derecho=eliminarRecursivo(nodoactual.derecho, valor);
            }else{
                if(nodoactual.izquierdo == null){
                    return nodoactual.derecho;
                }
                if (nodoactual.derecho==null){
                    return nodoactual.izquierdo;
                }
                nodoactual.data= (M)encontrarMinimo(nodoactual.derecho);
                nodoactual.derecho=eliminarRecursivo(nodoactual.derecho, nodoactual.data);
            }

            return nodoactual;
        }

}

