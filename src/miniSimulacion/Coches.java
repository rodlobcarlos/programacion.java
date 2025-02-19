package miniSimulacion;

import java.util.Objects;

public class Coches {
	private String marca;
	private String modelo;
	private String matricula;
	private Conductores dueño;
	private EstadoCoche estado;

	public Coches(String marca, String modelo, String matricula, Conductores dueño, EstadoCoche estado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.dueño = dueño;
		this.estado = estado;
	}

	public EstadoCoche getEstado() {
		return estado;
	}

	public void setEstado(EstadoCoche estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", dueño=" + dueño
				+ ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dueño, estado, marca, matricula, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coches other = (Coches) obj;
		return Objects.equals(dueño, other.dueño) && estado == other.estado && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Conductores getDueño() {
		return dueño;
	}

	public void setDueño(Conductores dueño) {
		this.dueño = dueño;
	}

	boolean fasePrueba(String coche, String dueño) {
		boolean puedeConducir;
		if (coche == dueño) {
			puedeConducir = true;
		} else {
			puedeConducir = false;
		}
		return puedeConducir;
	}

	 void cocheIgual(Coches m) {
		if (m.matricula.equals(matricula)) {
			System.out.println("Los coches son iguales.");
		} else {
			System.out.println("Los coches no son iguales.");
		}
	}

	 void debeParar(EstadoCoche estado) /* (Sensores s)*/{
		if (estado.equals(EstadoCoche.arrancado)) {
			System.out.println("Debe parar");
			EstadoCoche apagado = EstadoCoche.apagado;
			System.out.println(apagado);
		}/*else if (sensores.avisarObstaculo(49, EstadoCoche.arrancado)) {
			System.out.println("Debe parar");
			EstadoCoche apagado = EstadoCoche.apagado;
			System.out.println(apagado);
		}*/
	}
}
