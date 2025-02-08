package paquete2;

 public class Animal {
	String tipo;
	public String nombre;
	private int edad;
	
	public boolean caminar() {
		return true;
	}
	public void darDeComer() {
		if(tipo.equals("perro")) {
			comer();
		}
	}
	public void comer() {
		System.out.println("Estoy comiendo.");
	}
	boolean esDelMismoTipo(Animal a1, Animal a2) {
		boolean son = false;
		son = tipo.equals(a1.tipo);
		return son;
	}
}