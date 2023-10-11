import java.util.Scanner;

class Persona{
	String nombre;
	String correo;
	String telefono;

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}

	public void setCorreo(String cor){
		correo = cor;
	}

	public String getCorreo(){
		return correo;
	}

	public void setTelefono(String tel){
		telefono = tel;
	}

	public String getTelefono(){
		return telefono;
	}
}


class Alumno extends Persona{
    String matricula;
    double promedio;

    public void setMatricula(String matr){
        matricula = matr;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setPromed(double prom){
        promedio = prom;
    }

    public double getPromed(){
        return promedio;
    }
}

class Profesor extends Persona{
    int numEmp;
    double sueldo;

    public void setNumEmp(int numE){
        numEmp = numE;
    }

    public int getNumEmp(){
        return numEmp;
    }

    public void setSueldo(double suel){
        sueldo = suel;
    }

    public double getSueldo(){
        return sueldo;
    }
}


public class Practica3v3{
    public static void main(String args[]){
        int cant;
        String prueba;

        Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de alumnos que quiera ingresar: ");
		
		cant = scan.nextInt();

		Alumno al[] = new Alumno[cant];

		for(int i=0; i<cant; i++){
			int num = i+1;
			al[i] = new Alumno();
			System.out.print("Ingrese el nombre del alumno: ");
			prueba = scan.nextLine();
			al[i].setNombre(scan.nextLine());
			System.out.print("Ingrese la matricula del alumno: ");
			al[i].setMatricula(scan.nextLine());
			System.out.print("Ingrese el correo del alumno: ");
			al[i].setCorreo(scan.nextLine());
			System.out.print("Ingrese el telefono del alumno: ");
			al[i].setTelefono(scan.nextLine());
			System.out.print("Ingrese el promedio del alumno: ");
			al[i].setPromed(scan.nextDouble());
			System.out.println("");

			System.out.println("Alumno numero "+num);
			System.out.println("Nombre: "+al[i].getNombre());
			System.out.println("Matricula: "+al[i].getMatricula());
			System.out.println("Correo: "+al[i].getCorreo());
			System.out.println("Telefono: "+al[i].getTelefono());
			System.out.println("Promedio: "+al[i].getPromed());
			System.out.println("");
		}

        Profesor prof = new Profesor();

        System.out.print("Ingrese el Nombre del Profesor: ");
        prueba = scan.nextLine();
        prof.setNombre(scan.nextLine());
        System.out.print("Ingrese el Numero de Empleado del Profesor: ");
        prof.setNumEmp(scan.nextInt());
        System.out.print("Ingrese el Correo del Profesor: ");
        prueba = scan.nextLine();
        prof.setCorreo(scan.nextLine());
        System.out.print("Ingrese el Telefono del Profesor: ");
        prof.setTelefono(scan.nextLine());
        System.out.print("Ingrese el Sueldo del Profesor: ");
        prof.setSueldo(scan.nextDouble());
        System.out.println("");

        System.out.println("Nombre Profesor: "+prof.getNombre());
        System.out.println("Numero de Empleado: "+prof.getNumEmp());
        System.out.println("Correo Profesor: "+prof.getCorreo());
        System.out.println("Telefono Profesor: "+prof.getTelefono());
        System.out.println("Sueldo: "+prof.getSueldo());
    }
}