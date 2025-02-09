package orientacionObjetos;

public class MainPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon pikachu = new Pokemon(); 
		pikachu.nombre = "Pikachu";
		pikachu.nivel = 12;
		pikachu.tipo = "Electrico";
		
		Pokemon mew2 = new Pokemon();
		mew2.nombre = "Mewtwo";
		mew2.nivel = 20;
		mew2.tipo = "Psíquico";
		pikachu.nivel = pikachu.nivel + 2;
		
		boolean gana = pikachu.figth(mew2);
		System.out.println("Pikachu gana a Mewtwo: " + gana);
		
		String cadenaMew2 = mew2.convierteEnCadena();
		System.out.println(cadenaMew2);
		
		String cadenaPikachu = pikachu.convierteEnCadena();
		System.out.println(cadenaPikachu);
		System.out.println("Pokemon 2: " + mew2.nombre + " " +  mew2.nivel + " " +mew2.tipo);
	}
}