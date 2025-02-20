package rodriguez_carlos;

public class GestionDispositivos {

	public static void main(String[] args) {
		Smartphone smart1 = new Smartphone("Realme", "12", 300, false, 4);
		Laptop lapt1 = new Laptop("Asus", "MacBook", 850, 16, 4);
		PCSobremesa PC1 = new PCSobremesa("HP", "Omen", 1200, 16, false);
		
		Smartphone smart2 = new Smartphone("Xiaomi", "14", 300, false, 4);
		Laptop lapt2 = new Laptop("Asus", "MacBook", 850, 16, 4);
		PCSobremesa PC2 = new PCSobremesa("MSI", "prime", 1200, 16, false);
		
		Dispositivo smartphone = smart2;
		Dispositivo laptop = lapt2;
		Dispositivo pcSobremesa = PC2;
		
		System.out.println(smartphone.toString());
		System.out.println(laptop.toString());
		System.out.println(pcSobremesa.toString());
		
		System.out.println(smart1.equals(laptop));
		System.out.println(lapt2.equals(lapt1));
		
		
	}

}
