package repositorios;

import java.time.LocalDate;
import java.util.*;

import excepciones.EnvioException;
import modelos.CentroDistribucion;
import modelos.Envio;

public class RepositorioEnvios {
	// private /*TODO*/ envios ;
	public RepositorioEnvios() {
		super();
		// TODO Auto-generated constructor stub
	}

	// TODO: agregarCentroDistribucion
	public void agregarCentroDistribucion(String numSeguimiento, LocalDate fecha, CentroDistribucion centro) {
		// TODO: completar este método
	}

	// TODO: buscarEnvio
	public Envio buscarEnvio(LocalDate fechaEnvio, String numeroSeguimiento) throws EnvioException {
		// TODO: completar este método
		return null;
	}

	// TODO: filtrarEnviosPorCentro
	public List<Envio> filtrarEnviosPorCentro(String codigoCentro) {
		// TODO: completar este método
		return new ArrayList<>();
	}

	// TODO: buscarCentroDistribucion
	public boolean buscarCentroDistribucion(LocalDate fechaEnvio, String numeroSeguimiento, String codigoCentro) {
		// TODO: completar este método
		return false;
	}

	// TODO: isCentroFinal
	public boolean isCentroFinal(LocalDate fechaEnvio, String numeroSeguimiento, String codigoCentro) {
		// TODO: completar este método
		return false;
	}
}
