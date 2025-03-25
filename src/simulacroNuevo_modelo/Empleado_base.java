package simulacroNuevo_modelo;

import modelo.Empleado;

public class Empleado_base extends Empleados implements Actualizable_Sueldo {

	public Empleado_base(String dNI, String nombre, int sueldo, Puesto puesto) {
		super(dNI, nombre, sueldo, puesto);
		// TODO Auto-generated constructor stub		
	}

	int sueldo_incial;
	@Override
	int sueldo(Empleado e) {
		setSueldo();
		return 0;
	}
	
	@Override
	public int actualizar_sueldo() {
		int sueldo_actualizado = (int) (getSueldo() + (getSueldo() * 0.025));
		return 0;
	}
}
