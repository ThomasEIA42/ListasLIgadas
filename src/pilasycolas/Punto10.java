package pilasycolas;
import java.util.*;
public class Punto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> cola = new LinkedList<>();
        System.out.println("Ingrese los " + n + " elementos:");
        for (int i = 0; i < n; i++) {
            cola.add(sc.nextInt());
        }

            for (int i = 0; i < k; i++) {
                int frente = cola.poll(); // Sale del frente
                cola.add(frente);         // Entra al final
    }

            System.out.print("Resultado: ");
            for (int num : cola) System.out.print(num + " ");
            System.out.println();
        }
    }

