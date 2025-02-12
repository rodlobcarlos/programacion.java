package orientacionObjetos;

public class Persona_hrn {
	private String nombre;
	private String apellidos;
	private int edad;
	private float salario;
	private String email;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellidos() {
		return apellidos;
	}
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected float getSalario() {
		return salario;
	}
	protected void setSalario(float salario) {
		this.salario = salario;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	
	void concentrarse() {
		System.out.println("concentrarse del padre");
		return;
	}
	
	void concentrarse(int dias) {
		System.out.println("concentrarse del padre: " + dias);
		return;
	}
	
	void concentrarse(String lugar) {
		System.out.println("método concentrarse del padre con String " + lugar);
	}
	
	void viajar(String lugar) {
		
	}
	
	Persona_hrn persona1() {
		return null;
		
	}
	
	Persona_hrn persona(String nombre, String apellidos) {
		return null;
		
	}
	
	Persona_hrn persona() {
		return null;
		
	}
	
	Persona_hrn creaCopia() {
		return null;
		
	}
	
	@Override
	public String toString() {
		return "Persona_hrn [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", salario=" + salario
				+ ", email=" + email + "]";
	}
	
	public Persona_hrn(String nombre, String apellidos, int edad, float salario, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
		this.email = email;
	}
}
