package pilasycolas;
import java.util.*;

public class Punto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> pares = new LinkedList<>();
        Queue<Integer> impares = new LinkedList<>();
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares.add(num); // Clasificamos en la cola de pares
            } else {
                impares.add(num); // Clasificamos en la cola de impares
            }
        }

        // Mostramos primero pares y luego impares
        System.out.print("Nueva cola: ");
        while (!pares.isEmpty()) System.out.print(pares.poll() + " ");
        while (!impares.isEmpty()) System.out.print(impares.poll() + " ");
        System.out.println();
    }
}