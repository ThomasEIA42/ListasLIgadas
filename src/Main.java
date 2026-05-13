import colaPrioridad.Prioridades;
import colaPrioridad.Tarea;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarea> hospital = new PriorityQueue<>();

        hospital.add(new Tarea("Juan", "Perez", Prioridades.CLIENTE, 3));
        hospital.add(new Tarea("Ana", "Gomez", Prioridades.MEDICO, 5));
        hospital.add(new Tarea("Carlos", "Ruiz", Prioridades.DIRECTIVO, 5));
        hospital.add(new Tarea("Maria", "Lopez", Prioridades.MEDICO, 8));
        hospital.add(new Tarea("Luis", "Diaz", Prioridades.CLIENTE, 5));
        hospital.add(new Tarea("Elena", "Mendez", Prioridades.MEDICO, 5));

        while (!hospital.isEmpty()) {
            System.out.println(hospital.poll());
        }
    }
}