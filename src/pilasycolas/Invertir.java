package pilasycolas;

import java.util.Stack;

public class Invertir {
     public String invertir(String palabra) {
         Stack<Character> stack = new Stack<>();
         char[] letras = palabra.toCharArray();
          String invertir = " ";
          for( int i = 0; i < letras.length; i++){
              stack.push(letras[i]);
          }

          while (!stack.isEmpty()) {
              invertir += stack.pop();
          }
          return invertir;
     }
}
