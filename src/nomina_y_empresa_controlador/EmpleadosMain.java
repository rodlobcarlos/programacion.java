package nomina_y_empresa_controlador;

import nominas_y_empresa_modelo.AEmpleado.Categoria;
import nominas_y_empresa_modelo.AEmpleado.Desarrollador;
import nominas_y_empresa_modelo.AEmpleado.Jefe_proyecto;
import nominas_y_empresa_modelo.AEmpleado;

public class EmpleadosMain {

	public static void main(String[] args) {
		Desarrollador des = new Desarrollador("Carlos", 1, "Rodríguez Lobato", 1200, false, Categoria.DESARROLLADOR_JUNIOR, "Java, Phyton, HTML, CSS, MySQL", "React, Angular");
		Jefe_proyecto jePro = new Jefe_proyecto("Carlos", 1, "Rodríguez Lobato", 1500, true, Categoria.JEFE_PROYECTO);
		
		System.out.println(des.devuleveFunciones());
		des.imprimeHorario();

		System.out.println(jePro.devuleveFunciones());
		jePro.imprimeHorario();
	}
}