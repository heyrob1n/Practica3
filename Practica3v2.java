import java.util.Scanner;

class Persona
{
    String nombre;
    String correo;
    String telefono;

    public void setNombre(String nom)
    {
        nombre = nom;
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setCorreo(String cor)
    {
        correo = cor;
    }

    public String getCorreo()
    {
        return correo;
    }
   
    public void setTelefono(String tel)
    {
        telefono = tel;
    }

    public String getTelefono()
    {
        return telefono;
    }
}


class Alumno extends Persona
{
    String matricula;
    String promedio;

    public void setMatricula(String mat)
    {
        matricula = mat;
    }

    public String getMatricula()
    {
        return matricula;
    }
    
        public void setPromedio(String prom)
    {
        promedio = prom;
    }

    public String getPromedio()
    {
        return promedio;
    }
}

class Profesor extends Persona
{
    int numEmpleado;
    float Sueldo;

    public void setNumEmpleado(int numemp)
    {
        numEmpleado = numemp;
    }

    public int getNumEmpleado()
    {
        return numEmpleado;
    }
    
    public void setSueldo(float sueld)
    {
        Sueldo = sueld;
    }

    public float getSueldo()
    {
        return Sueldo;
    }
}

public class Practica3v2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese los datos del profesor:\n");
        Profesor prof1 = new Profesor();
        
        System.out.print("Nombre: ");
        prof1.setNombre(scanner.nextLine());
        
        System.out.print("Correo: ");
        prof1.setCorreo(scanner.nextLine());
        
        System.out.print("Teléfono: ");
        prof1.setTelefono(scanner.nextLine());
        
        System.out.print("Número de Empleado: ");
        prof1.setNumEmpleado(scanner.nextInt());
        
        System.out.print("Sueldo: ");
        prof1.setSueldo(scanner.nextFloat());

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("\nIngrese los datos del alumno " + (i + 1) + ":\n");
            alumnos[i] = new Alumno();
            scanner.nextLine();  // Consume the newline character
            
            System.out.print("Nombre: ");
            alumnos[i].setNombre(scanner.nextLine());
            
            System.out.print("Correo: ");
            alumnos[i].setCorreo(scanner.nextLine());
            
            System.out.print("Teléfono: ");
            alumnos[i].setTelefono(scanner.nextLine());
            
            System.out.print("Matrícula: ");
            alumnos[i].setMatricula(scanner.nextLine());
            
            System.out.print("Promedio: ");
            alumnos[i].setPromedio(scanner.nextLine());
        }
        
        scanner.close();

        System.out.println("\nDatos del profesor:");
        System.out.println("Nombre: " + prof1.getNombre());
        System.out.println("Correo: " + prof1.getCorreo());
        System.out.println("Teléfono: " + prof1.getTelefono());
        System.out.println("Número de Empleado: " + prof1.getNumEmpleado());
        System.out.println("Sueldo: " + prof1.getSueldo());

        System.out.println("\nDatos de los alumnos:");
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nombre: " + alumnos[i].getNombre());
            System.out.println("Correo: " + alumnos[i].getCorreo());
            System.out.println("Teléfono: " + alumnos[i].getTelefono());
            System.out.println("Matrícula: " + alumnos[i].getMatricula());
            System.out.println("Promedio: " + alumnos[i].getPromedio());
            System.out.println();
        }
    }
}