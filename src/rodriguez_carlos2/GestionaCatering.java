package rodriguez_carlos2;

import java.time.LocalDate;

public class GestionaCatering {

	public static void main(String[] args) {
		Menus menu1 = new Menus("12345678-s", "menu1", 30, 9, 30, "Vegano", false, LocalDate.now(), 4);
		Menus menu2 = new Menus("12345678-s", "menu2", 40, 15, 40, "Carne", false, LocalDate.now(), 6);
		Menus menu3 = new Menus("12445348-t", "menu3", 40, 10, 5, "Vegetales", false, LocalDate.now(), 3);
		
		Clientes cliente1 = new Clientes("2345465-g", "Carlos", null, 0, null, null, false);
		Clientes cliente2 = new Clientes("2345465-g", "Pepe", null, 0, null, null, false);
		Clientes cliente3 = new Clientes("2345465-g", "Juan", null, 0, null, null, false);
	}

}
