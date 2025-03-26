package rodriguez_carlos_Examen2;

import java.util.Objects;

public class Ciudad implements IRuta{
	private String nombre;
	private int habitantes;

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getHabitantes() {
		return habitantes;
	}

	protected void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public Ciudad(String nombre, int habitantes) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
	}

	@Override
	public double getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipoRuta() {
		// TODO Auto-generated method stub
		return null;
	}

}
