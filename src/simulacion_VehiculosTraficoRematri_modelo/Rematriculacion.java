package simulacion_VehiculosTraficoRematri_modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Rematriculacion {
	private String num_bastidor;
	private String matricula_inicial;
	private String matricula_final;
	private LocalDate fecha_matriculacion;
	
	public String getNum_bastidor() {
		return num_bastidor;
	}
	public void setNum_bastidor(String num_bastidor) {
		this.num_bastidor = num_bastidor;
	}
	public String getMatricula_inicial() {
		return matricula_inicial;
	}
	public void setMatricula_inicial(String matricula_inicial) {
		this.matricula_inicial = matricula_inicial;
	}
	public String getMatricula_final() {
		return matricula_final;
	}
	public void setMatricula_final(String matricula_final) {
		this.matricula_final = matricula_final;
	}
	public LocalDate getFecha_matriculacion() {
		return fecha_matriculacion;
	}
	public void setFecha_matriculacion(LocalDate fecha_matriculacion) {
		this.fecha_matriculacion = fecha_matriculacion;
	}
	@Override
	public String toString() {
		return "Rematriculacion [num_bastidor=" + num_bastidor + ", matricula_inicial=" + matricula_inicial
				+ ", matricula_final=" + matricula_final + ", fecha_matriculacion=" + fecha_matriculacion + "]";
	}
	public Rematriculacion(String num_bastidor, String matricula_inicial, String matricula_final,
			LocalDate fecha_matriculacion) {
		super();
		this.num_bastidor = num_bastidor;
		this.matricula_inicial = matricula_inicial;
		this.matricula_final = matricula_final;
		this.fecha_matriculacion = fecha_matriculacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fecha_matriculacion, num_bastidor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rematriculacion other = (Rematriculacion) obj;
		return Objects.equals(fecha_matriculacion, other.fecha_matriculacion)
				&& Objects.equals(num_bastidor, other.num_bastidor);
	}
}	
