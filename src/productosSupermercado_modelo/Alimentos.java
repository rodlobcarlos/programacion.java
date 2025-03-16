package productosSupermercado_modelo;

import java.time.LocalDate;

public interface Alimentos {
	public void setCaducidad(LocalDate fecha);
	public LocalDate getCaducidad();
	public int getCalorias();
}
