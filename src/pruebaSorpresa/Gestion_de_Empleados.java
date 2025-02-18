package pruebaSorpresa;

public class Gestion_de_Empleados {

	public static void main(String[] args) {
		Empleados emp1 = new Administrativo("Carlos", "12345678A", 1200, 40);
		Empleados emp2 = new Directivos("Juan", "87654321B", 2800, 15);
		
		emp1.igualEmpleado(emp2);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
	}

}
