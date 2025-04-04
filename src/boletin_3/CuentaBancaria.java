package boletin_3;

public class CuentaBancaria {
	private double saldo;
	private String numero_cuanta;
	private Persona titular_cuanta;
	private Persona autorizado;

	public CuentaBancaria(double saldo, String numero_cuanta, Persona titular_cuanta) {
		super();
		this.saldo = saldo;
		this.numero_cuanta = numero_cuanta;
		this.titular_cuanta = titular_cuanta;
	}

	public Persona getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero_cuanta() {
		return numero_cuanta;
	}

	public void setNumero_cuanta(String numero_cuanta) {
		this.numero_cuanta = numero_cuanta;
	}

	public Persona getTitular_cuanta() {
		return titular_cuanta;
	}

	public void setTitular_cuanta(Persona titular_cuanta) {
		this.titular_cuanta = titular_cuanta;
	}

	private boolean validarAutorizado(String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}

	public void ingresarDinero(Persona gestionarPersona, double ingreso) {
		if (validarAutorizado(gestionarPersona.getDni()) && importePositivo(ingreso)) {
			setSaldo(getSaldo() + ingreso);
		} else {
			System.out.println("ingreso incorrecto o no es autorizado.");
		}
	}

	public void retirarDinero(Persona gestionarPersona, double reintegro) {
		if (validarAutorizado(gestionarPersona.getDni()) && importePositivo(reintegro) && getSaldo() >= reintegro) {
			setSaldo(getSaldo() - reintegro);
		}else {
			System.out.println("Ingreso incorrecto, no es autorizado o saldo insuficiente.");
		}
	}

	private boolean importePositivo(double importe) {
		return importe > 0;
	}
	
	public void eliminarAutorizado(String dni) {
		if (validarAutorizado(dni)) {
			autorizado = null;
		}else {
			System.out.println("No esta autorizado.");
		}
	}
}