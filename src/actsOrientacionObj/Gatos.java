package actsOrientacionObj;

public class Gatos {
	public String color;
	public String raza;
	public String sexo;
	public int edad;
	public float peso;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Gatos [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ "]";
	}
	
	public Gatos(String color, String raza, String sexo, int edad, float peso) {
		super();
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}
	
	String maullar() {
		return "rrrrrrrrr";
	}
	
	String ronronea() {
		return "miaauuuuuuu";
	}
	
	void comer(String comida) {
		if (comida == "pescado") {
			System.out.println("yummy yummy");
		}else {
			System.out.println("buaahh, mejor no");
		}
	}
	
	void pelear(Gatos gato) {
		if(gato.sexo.equals(sexo)) {
			System.out.println("ven aqui que te vas a enterar");
		}else {
			System.out.println("la violencia nunca es la solución");
		}
	}
}
