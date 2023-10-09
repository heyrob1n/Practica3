public class Profesor extends Persona {
    private String numEmpleado;
    private double sueldo;

    public Profesor(String nombre, String correo, String telefono, String numEmpleado, double sueldo) {
        super(nombre, correo, telefono);
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
