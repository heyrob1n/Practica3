public class Alumno extends Persona {
    private int matricula;
    private double promedio;

    public Alumno(String nombre, String correo, String telefono, int matricula, double promedio) {
        super(nombre, correo, telefono);
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
