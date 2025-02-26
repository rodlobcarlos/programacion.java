package controlador;

import java.time.LocalDate;

import modelo.Cliente;
import modelo.CuentaBancaria;

public class CuentasMain {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Carlos", "Rodríguez Lobato", "29542549S");
		Cliente cli2 = new Cliente("Pepe", "Heredia Basilio", "13457392A");
		Cliente cli3 = new Cliente("Manuel", "Sánchez Martín", "28047512D");
		
		CuentaBancaria cuenta1 = new CuentaBancaria(14000, 0, LocalDate.of(2023, 05, 7), "IBAN12343566567678768456", cli1, cli1);
		CuentaBancaria cuenta2 = new CuentaBancaria(12000, 0, LocalDate.of(2022, 07, 5), "IBAN32563766825255634667", cli2, cli2);
		CuentaBancaria cuenta3 = new CuentaBancaria(10000, 0, LocalDate.of(2024, 03, 8), "IBAN32456676232134276842", cli3, null);

		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
		CuentaBancaria.getContador();

	}
}
