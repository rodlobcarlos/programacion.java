package boletin_3;

public class CuentaBancaria {
	private double saldo;
	private int numero_cuanta;
	private String titular_cuanta;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero_cuanta() {
		return numero_cuanta;
	}

	public void setNumero_cuanta(int numero_cuanta) {
		this.numero_cuanta = numero_cuanta;
	}

	public String getTitular_cuanta() {
		return titular_cuanta;
	}

	public void setTitular_cuanta(String titular_cuanta) {
		this.titular_cuanta = titular_cuanta;
	}
	
	double cantidad = 0;
	double ingresarDinero() {
		double ingreso = saldo + cantidad;
		return ingreso;
	}

	double retirarDinero() {
		double retiro = saldo - cantidad ;
		return retiro;
	}

	boolean ingresoPositivo(int ingreso) {
		boolean positivo1 = true;
		if (ingreso >= 0) {
			System.out.println(positivo1);
		} else {
			positivo1 = false;
			System.out.println(positivo1);
		}
		return positivo1;
	}

	boolean retiroPositivo(int retiro) {
		boolean positivo2 = true;
		if (retiro >= 0) {
			System.out.println(positivo2);
		} else {
			positivo2 = false;
			System.out.println(positivo2);
		}
		return positivo2;
	}
	
	String eliminarAutorizado(String getDni) {
		String dni = null;
		return dni;
	}

}