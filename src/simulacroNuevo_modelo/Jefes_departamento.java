package simulacroNuevo_modelo;

import modelo.Empleado;

public class Jefes_departamento extends Empleados implements Actualizable_Sueldo{
	public Jefes_departamento(String dNI, String nombre, int sueldo, Puesto puesto) {
		super(dNI, nombre, sueldo, puesto);
		// TODO Auto-generated constructor stub
	}

	private int antiguedad_empresa;

	public int getAntiguedad_empresa() {
		return antiguedad_empresa;
	}

	public void setAntiguedad_empresa(int antiguedad_empresa) {
		this.antiguedad_empresa = antiguedad_empresa;
	}

	int sueldo_incial;
	@Override
	int sueldo(Empleado e) {
		if(e.equals(Puesto.ADMINISTRATIVO)) {
			sueldo_incial = 1150;
		}else if(e.equals(Puesto.OPERARIO)) { 
			sueldo_incial = 1100;
		}else {
			sueldo_incial = 1350;
		}
		return sueldo_incial;
	}

	int actualizar;
	@Override
	public int actualizar_sueldo() {
		actualizar = (int) (setSueldo(sueldo) + 2.5f);
		return 0;
	}
}
