package videojuego.modelo;

public class EstudioDesarrollo {
    private String nombreEstudio;
    private String desarrolladorPrincipal;
    private String pais;

    public EstudioDesarrollo(String nombreEstudio, String desarrolladorPrincipal, String pais) {
        this.nombreEstudio = nombreEstudio;
        this.desarrolladorPrincipal = desarrolladorPrincipal;
        this.pais = pais;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public String getDesarrolladorPrincipal() {
        return desarrolladorPrincipal;
    }

    public String getPais() {
        return pais;
    }

    public void setNombreEstudio(String nombreEstudio) {
		this.nombreEstudio = nombreEstudio;
	}

	public void setDesarrolladorPrincipal(String desarrolladorPrincipal) {
		this.desarrolladorPrincipal = desarrolladorPrincipal;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
    public String toString() {
        return nombreEstudio + " - " + desarrolladorPrincipal + " (" + pais + ")";
    }
}
