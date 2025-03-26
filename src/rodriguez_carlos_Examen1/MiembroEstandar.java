package rodriguez_carlos_Examen1;

public class MiembroEstandar extends MiembroBase{

	public MiembroEstandar(String email, String nombre, MiembroBase[] amigos, int contadorAmigos) {
		super(email, nombre, amigos, contadorAmigos);
		// TODO Auto-generated constructor stub
	}
	
	private int maximoAmigos;
	
	protected int getMaximoAmigos() {
		return maximoAmigos;
	}

	protected void setMaximoAmigos(int maximoAmigos) {
		this.maximoAmigos = maximoAmigos;
	}

	public MiembroEstandar(String email, String nombre, MiembroBase[] amigos, int contadorAmigos, int maximoAmigos) {
		super(email, nombre, amigos, contadorAmigos);
		this.maximoAmigos = 50;
	}

	@Override
	public String toString() {
		return "MiembroEstandar [maximoAmigos=" + maximoAmigos + ", getTipoUsuario()=" + getTipoUsuario() + "]";
	}

	@Override
	String getTipoUsuario() {
		return "Estándar";
	}
}
