package rodriguez_carlos_Examen2;

public class Rutaterrestre extends RutaBase implements IRuta{
	
	public Rutaterrestre(int id, String cuidadOrigen, String ciudadDestino, float distancia) {
		super(id, cuidadOrigen, ciudadDestino, distancia);
		// TODO Auto-generated constructor stub
	}

	private boolean siEsCarretera;
	private final static float costeCienKms = 0.65f;
	
	

	protected boolean isSiEsCarretera() {
		return siEsCarretera;
	}

	protected void setSiEsCarretera(boolean siEsCarretera) {
		this.siEsCarretera = siEsCarretera;
	}

	protected float getCosteCienKms() {
		return costeCienKms;
	}

	public Rutaterrestre(int id, String cuidadOrigen, String ciudadDestino, float distancia, boolean siEsCarretera,
			String cadena) {
		super(id, cuidadOrigen, ciudadDestino, distancia);
		this.siEsCarretera = siEsCarretera;
		this.cadena = cadena;
	}

	@Override
	public double getCoste() {
		double calculo_coste = getDistancia() * costeCienKms;
		return calculo_coste;
	}
	
	String cadena;
	@Override
	public String getTipoRuta() {
		if(siEsCarretera) {
			cadena = "RutaTerrestre: carretera";
		}else {
			cadena = "RutaTerrestre: tren";
		}
		return cadena;
	}


}
