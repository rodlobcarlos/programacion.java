package gestionEmpleados;

public class GestionEmpleados {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("47568789M", "Darío", 1545);

		e1.calcularSalario();

		Administrativo carlos = new Administrativo("12345678A", "Carlos", 1200, 40);
		Directivo juan = new Directivo("87654321B", "Juan", 2800, 15);
		
		Administrativo carlos2 = new Administrativo("12345678A", "Carlos2", 1500, 200);

		carlos.calcularSalario();
		juan.calcularSalario();
		
		System.out.println();
		
		
		System.out.println(carlos.equals(juan));
		System.out.println(carlos.equals(carlos2));
		
		System.out.println();
		System.out.println(carlos);
		System.out.println(juan);
		

	}

}
