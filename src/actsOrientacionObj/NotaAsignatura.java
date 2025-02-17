package actsOrientacionObj;

public class NotaAsignatura {
	public String nombreAsignatura;
	public float nota_1Trimestre;
	public float nota_2Trimestre;
	public float nota_3Trimestre;
	
	@Override
	public String toString() {
		return "NotaAsignatura [nombreAsignatura=" + nombreAsignatura + ", nota_1Trimestre=" + nota_1Trimestre
				+ ", nota_2Trimestre=" + nota_2Trimestre + ", nota_3Trimestre=" + nota_3Trimestre + "]";
	}
	
	public NotaAsignatura(String nombreAsignatura, float nota_1Trimestre, float nota_2Trimestre,
			float nota_3Trimestre) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.nota_1Trimestre = nota_1Trimestre;
		this.nota_2Trimestre = nota_2Trimestre;
		this.nota_3Trimestre = nota_3Trimestre;
	}
	
	public float notaMedia() {
		float media = (nota_1Trimestre + nota_2Trimestre + nota_3Trimestre) / 3;
		return media;
	}
	
	int trimestresAprobados() {
		int contador = 0;
		if(nota_1Trimestre >= 5) {
			contador++;
		} if (nota_2Trimestre >= 5) {
			contador++;
		} if (nota_3Trimestre >= 5) {
			contador++;
		}else {
			contador = 0;
			System.out.println("No ha aprobado ningún trimestre.");
		}
		return contador;
	}
} 
