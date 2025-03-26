package rodriguez_carlos_Examen2;

public class RutaAerea extends RutaBase implements IRuta{
	public RutaAerea(int id, String cuidadOrigen, String ciudadDestino, float distancia) {
		super(id, cuidadOrigen, ciudadDestino, distancia);
		// TODO Auto-generated constructor stub
	}

	private TipoVuelo vuelo;

	protected TipoVuelo getVuelo() {
		return vuelo;
	}

	protected void setVuelo(TipoVuelo vuelo) {
		this.vuelo = vuelo;
	}

	double calculo_coste;
	@Override
	public double getCoste() {
		if(getVuelo().equals(TipoVuelo.LOW_COST)) {
			calculo_coste = getDistancia() * 0.75;
		}else if(getVuelo().equals(TipoVuelo.NORMAL)) {
			calculo_coste = getDistancia() * 1.1;
		}else {
			calculo_coste = getDistancia() * 1.5;
		}
		return calculo_coste;
	}

	public RutaAerea(int id, String cuidadOrigen, String ciudadDestino, float distancia, TipoVuelo vuelo,
			double calculo_coste, String cadena) {
		super(id, cuidadOrigen, ciudadDestino, distancia);
		this.vuelo = vuelo;
		this.calculo_coste = calculo_coste;
		this.cadena = cadena;
	}

	String cadena;
	@Override
	public String getTipoRuta() {
		cadena = "RutaAerea " + getVuelo();
		return cadena;
	}

}
