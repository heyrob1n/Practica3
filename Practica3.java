import java.util.Scanner;

class Persona {
    private String nombre;
    private String correo;
    private String telefono;

    public Persona(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Alumno extends Persona {
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

class Profesor extends Persona {
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

public class Practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        Alumno[] alumnos = new Alumno[numAlumnos];

        // Capturar datos de los alumnos
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("\nIngrese los datos del alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Correo: ");
            String correo = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine();  // Consumir el salto de línea

            alumnos[i] = new Alumno(nombre, correo, telefono, matricula, promedio);
        }

        // Capturar datos del profesor
        System.out.println("\nIngrese los datos del profesor:");
        System.out.print("Nombre: ");
        String nombreProfesor = scanner.nextLine();
        System.out.print("Correo: ");
        String correoProfesor = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoProfesor = scanner.nextLine();
        System.out.print("Número de Empleado: ");
        String numEmpleado = scanner.nextLine();
        System.out.print("Sueldo: ");
        double sueldo = scanner.nextDouble();

        Profesor profesor = new Profesor(nombreProfesor, correoProfesor, telefonoProfesor, numEmpleado, sueldo);

        // Imprimir los datos de los alumnos
        System.out.println("\nDatos de los alumnos:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("\nAlumno " + (i + 1) + ":");
            System.out.println("Nombre: " + alumnos[i].getNombre());
            System.out.println("Correo: " + alumnos[i].getCorreo());
            System.out.println("Teléfono: " + alumnos[i].getTelefono());
            System.out.println("Matrícula: " + alumnos[i].getMatricula());
            System.out.println("Promedio: " + alumnos[i].getPromedio());
        }

        // Imprimir los datos del profesor
        System.out.println("\nDatos del profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Correo: " + profesor.getCorreo());
        System.out.println("Teléfono: " + profesor.getTelefono());
        System.out.println("Número de Empleado: " + profesor.getNumEmpleado());
        System.out.println("Sueldo: " + profesor.getSueldo());
    }
}
