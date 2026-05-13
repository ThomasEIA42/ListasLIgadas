package colaPrioridad;

public class Tarea implements Comparable<Tarea> {
    private String nombre;
    private String apellido;
    private Prioridades prioridad;
    private int prioridadEnfermedad;
    private double aleatorio;

    public Tarea(String nombre, String apellido, Prioridades prioridad, int prioridadEnfermedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prioridad = prioridad;
        this.prioridadEnfermedad = prioridadEnfermedad;
        this.aleatorio = Math.random();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Prioridades getPrioridad() {
        return prioridad;
    }

    public int getPrioridadEnfermedad() {
        return prioridadEnfermedad;
    }

    @Override
    public int compareTo(Tarea otra) {
        if (this.prioridadEnfermedad != otra.prioridadEnfermedad) {
            return Integer.compare(otra.prioridadEnfermedad, this.prioridadEnfermedad);
        }

        if (this.prioridad != otra.prioridad) {
            return this.prioridad.compareTo(otra.prioridad);
        }

        return Double.compare(this.aleatorio, otra.aleatorio);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " | " + prioridad + " | Prioridad Enfermedad: " + prioridadEnfermedad;
    }


}