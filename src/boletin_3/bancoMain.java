package boletin_3;

import java.time.LocalDate;

public class bancoMain {

	public static void main(String[] args) {
		Persona titular = new Persona("123456789C", "Carlos", "Rodríguez", LocalDate.of(2005, 01, 30));
		Persona autorizado = new Persona("123456789C", "Carlos", "Rodríguez", LocalDate.of(2005, 01, 30));
		CuentaBancaria cuenta = new CuentaBancaria(200, "ES123456789043245656767", autorizado);
		
//		cuenta.ingresarDinero(autorizado, 50);
//		System.out.println(cuenta.getSaldo());
		
//		cuenta.retirarDinero(autorizado, 30);
//		System.out.println(cuenta.getSaldo());
		
//		cuenta.eliminarAutorizado("123456789C");
//		System.out.println(cuenta);
	}
}