package comic_fest_España_modelo;

import java.time.LocalDate;

public class EntradaVip {
	private int codigo_entrada;
	private LocalDate fecha_entrada;
	private TipoEntrada tipo;
	private Estadoentrada estado;
	public int getCodigo_entrada() {
		return codigo_entrada;
	}
	public void setCodigo_entrada(int codigo_entrada) {
		this.codigo_entrada = codigo_entrada;
	}
	public LocalDate getFecha_entrada() {
		return fecha_entrada;
	}
	public void setFecha_entrada(LocalDate fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	public TipoEntrada getTipo() {
		return tipo;
	}
	public void setTipo(TipoEntrada tipo) {
		this.tipo = tipo;
	}
	public Estadoentrada getEstado() {
		return estado;
	}
	public void setEstado(Estadoentrada estado) {
		this.estado = estado.ENVIADA;
	}
	@Override
	public String toString() {
		return "EntradaVip [codigo_entrada=" + codigo_entrada + ", fecha_entrada=" + fecha_entrada + ", tipo=" + tipo
				+ ", estado=" + estado + "]";
	}
	public EntradaVip(int codigo_entrada, LocalDate fecha_entrada, TipoEntrada tipo, Estadoentrada estado) {
		super();
		this.codigo_entrada = codigo_entrada;
		this.fecha_entrada = fecha_entrada;
		this.tipo = tipo;
		setEstado(estado);  
	}
}
