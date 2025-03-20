package nomina_y_empresa_controlador;

import nominas_y_empresa_modelo.Categoria;
import nominas_y_empresa_modelo.Desarrollador;
import nominas_y_empresa_modelo.Jefe_proyecto;


public class EmpleadoMain {

	public static void main(String[] args) {
		Desarrollador des1 = new Desarrollador("Carlos", 1, "Rodríguez Lobato", 1200, false,
				Categoria.DESARROLLADOR_JUNIOR, 5, 2);
		System.out.println(des1.devuleveFunciones());
		des1.imprimeHorario();
		System.out.println(des1.calculaImporteNomina());

		Jefe_proyecto jePro = new Jefe_proyecto("Carlos", 1, "Rodríguez Lobato", 1500, true, 
				Categoria.JEFE_PROYECTO);

		System.out.println(jePro.devuleveFunciones());
		jePro.imprimeHorario();
		System.out.println(jePro.calculaImporteNomina());
	}
}