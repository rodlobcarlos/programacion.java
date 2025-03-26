package rodriguez_carlos_Examen1;

public class MiembroPremiun extends MiembroBase{
	public MiembroPremiun(String email, String nombre, MiembroBase[] amigos, int contadorAmigos) {
		super(email, nombre, amigos, contadorAmigos);
		// TODO Auto-generated constructor stub
	}

	private int maximoAmigos;
	private TipoPremiun tipo;
	
	

	protected TipoPremiun getTipo() {
		return tipo;
	}

	protected void setTipo(TipoPremiun tipo) {
		this.tipo = tipo;
	}

	protected int getMaximoAmigos() {
		return maximoAmigos;
	}

	protected void setMaximoAmigos(int maximoAmigos) {
		this.maximoAmigos = maximoAmigos;
	}

	@Override
	public String toString() {
		return "MiembroPremiun [maximoAmigos=" + maximoAmigos + ", tipo=" + tipo + ", getTipoUsuario()="
				+ getTipoUsuario() + "]";
	}

	public MiembroPremiun(String email, String nombre, MiembroBase[] amigos, int contadorAmigos, int maximoAmigos,
			TipoPremiun tipo) {
		super(email, nombre, amigos, contadorAmigos);
		this.maximoAmigos = 100;
		this.tipo = tipo;
	}

	@Override
	String getTipoUsuario() {
		if(getTipo().equals(TipoPremiun.PREMIUN)) {
			return "Premiun: " + TipoPremiun.PREMIUN;
		}else if(getTipo().equals(TipoPremiun.PREMIUN_VIP)) {
			return "Premiun: " + TipoPremiun.PREMIUN_VIP;
		}
		return null;
	}
	
	MiembroBase addAmigo(MiembroBase miembro) {
		return null;
	}
}
