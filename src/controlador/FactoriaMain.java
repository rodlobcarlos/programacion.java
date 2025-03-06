package controlador;

import java.time.LocalDate;
import java.util.Arrays;

import modelo.CamaraSeguridad;
import modelo.DispositivosWifi;
import modelo.Ensamblador;
import modelo.Estado;
import modelo.EstadoWifi;
import modelo.Pintor;
import modelo.PuertaAutomatica;
import modelo.Robots;
import modelo.SensoresTemperatura;
import modelo.Soldador;

public class FactoriaMain {

	public static void main(String[] args) {
		Robots rb1 = new Soldador(0, "Modelo1", 80, Estado.APAGADO, "electricidad", "Nuevo", 0, "P", 20f, "13234342345");
		Robots rb2 = new Pintor(0, "Modelo2", 90, Estado.ALERTA, "electricidad", "Nuevo", 0, "S");
		Robots rb3 = new Ensamblador(0, "Modelo3", 50, Estado.ENCENDIDO, "gasolina", "Nuevo", 0, "C");
		
		DispositivosWifi disp1 = new SensoresTemperatura(0, "1233243sad", EstadoWifi.OFF, LocalDate.now());
		DispositivosWifi disp2 = new CamaraSeguridad(0, "252565343sad", EstadoWifi.ON_CONECTADO, LocalDate.now());
		DispositivosWifi disp3 = new PuertaAutomatica(0, "56256253asf", EstadoWifi.ON_CONECTADO, LocalDate.now());
		
		int contador = 0;
		int contador1 = 0;
		
		Robots [] inventarioRobot = new Robots [20];
		inventarioRobot[contador] = rb1;
		contador +=1;
		inventarioRobot[contador] = rb2;
		contador +=1;
		inventarioRobot[contador] = rb3;
		contador +=1;
		System.out.println(Arrays.toString(inventarioRobot));

		DispositivosWifi [] disp = new DispositivosWifi[40];
		disp [contador1] = disp1;
		contador +=1;
		disp [contador1] = disp2;
		contador +=1;
		disp [contador1] = disp3;
		contador +=1;
		System.out.println(Arrays.toString(disp));
		
		
	}
}
