package pilasycolas;

import java.util.*;

public class Punto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 1. Leemos cuántas operaciones se realizarán.
        Stack<String> pila = new Stack<>(); // 2. Creamos la pila para almacenar las palabras.

        for (int i = 0; i < n; i++) {
            String op = sc.next(); // 3. Leemos la palabra o el comando DESHACER.
            if (op.equals("DESHACER")) {
                if (!pila.isEmpty()) pila.pop(); // 4. Si es DESHACER, eliminamos la última palabra (cima).
            } else {
                pila.push(op); // 5. Si es una palabra normal, la guardamos en la pila.
            }
        }

        // 6. Para mostrar el texto en orden original, usamos un String Joiner o recorremos la pila.
        System.out.println(String.join(" ", pila));
    }
}
