  public static boolean Balanceado(String cadena) {
    Stack<Character> pila = new Stack<>();

    for (int i = 0; i < cadena.length(); i++) {
        char caracter = cadena.charAt(i);

        if (caracter == '(') {
            // Apilar si es de apertura
            pila.push(caracter);
        } else if (caracter == ')') {
            // Si encontramos uno de cierre y la pila está vacía, no está balanceado
            if (pila.isEmpty()) {
                return false;
            }
            // Desapilar su correspondiente pareja
            pila.pop();
        }
    }

    // Si la pila está vacía al final, está balanceado
    return pila.isEmpty();
}

void main() {
}
