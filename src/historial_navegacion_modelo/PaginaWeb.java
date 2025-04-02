package historial_navegacion_modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class PaginaWeb {
	private String url;
	private LocalDateTime fecha;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.fecha.compareTo(fecha));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fecha, other.fecha);
	}
	
	public PaginaWeb(String url, LocalDateTime fecha) {
		super();
		this.url = url;
		this.fecha = fecha;
	}
	void agragarPaginaHistorial() throws HistorialException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame el nombre de la página web: ");
		String nombre = scanner.next();
		
		if(this.fecha == null) {
			this.fecha = LocalDateTime.now();
		}else if(this.fecha.equals(LocalDateTime.now().plusSeconds(1))) {
			throw new HistorialException("Esta página tiene fecha futuro"); 
		}
	}
	
	void consultarHistorialCompleto() {
		for()
	}
}
