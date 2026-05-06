package pilasycolas;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> Lista = new Stack<>();
        Lista.add(1);
        Lista.add(2);
        Lista.add(3);
        //add = push
        // agregan en la punta la pila
        System.out.println(Lista.pop());
    }
}
