package boletin_3;

public class TorneoMain {

	public static void main(String[] args) {
		Participante participante1 = new Participante("Carlitos", "Carlos", 20, 50);
		Participante participante2 = new Participante("Nando", "Fernando", 30, 35);
		Participante participante3 = new Participante("Toni", "Antonio", 26, 49);
		Participante participante4 = new Participante("JC", "Joseca", 19, 24);
		
		Participante [] jugador = {participante1, participante2, participante3, participante4};
				
		Torneo partida1 = new Torneo("Catán", jugador);
		
		partida1.juGanador();
		System.out.println("Resultados:");
		System.out.println(partida1);
	}
}