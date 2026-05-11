package pilasycolas;

import java.util.*;

public class Punto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expresion = sc.nextLine();

        Stack<Integer> pila = new Stack<>();
        String[] partes = expresion.split(" ");

        for (String p : partes) {
            if (p.equals("+") || p.equals("-") || p.equals("*") || p.equals("/")) {
                int b = pila.pop(); // Operando derecho
                int a = pila.pop(); // Operando izquierdo
                switch (p) {
                    case "+": pila.push(a + b); break;
                    case "-": pila.push(a - b); break;
                    case "*": pila.push(a * b); break;
                    case "/": pila.push(a / b); break;
                }
            } else {
                pila.push(Integer.parseInt(p)); // Es un número, va a la pila
            }
        }
        System.out.println("Resultado: " + pila.pop());
    }
}
