package modelo;

import java.time.LocalDate;

public class CuentaBancaria {
	private static int contador;
	private float saldo;
	private LocalDate fechaApertura;
	private int ID;
	private String IBAN;
	private Cliente clienteTitular;
	private Cliente ClienteAutorizado;
	
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		CuentaBancaria.contador = contador;
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", fechaApertura=" + fechaApertura
				+ ", ID=" + ID + ", IBAN=" + IBAN + ", clienteTitular=" + clienteTitular + ", ClienteAutorizado="
				+ ClienteAutorizado + "]";
	}
	public CuentaBancaria(float saldo, int iD, LocalDate fechaApertura, String iBAN,
			Cliente clienteTitular, Cliente clienteAutorizado) {
		super();
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.ID = contador+1;
		this.IBAN = iBAN;
		this.clienteTitular = clienteTitular;
		this.ClienteAutorizado = clienteAutorizado;
		contador = contador+1;
	}
}
