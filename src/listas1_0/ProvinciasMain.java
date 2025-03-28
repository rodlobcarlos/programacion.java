package listas1_0;

import java.util.HashSet;
import java.util.Set;

public class ProvinciasMain {

	public static void main(String[] args) {
		Provincia p1 = new Provincia("Sevilla", 2134235235);
		Provincia p2 = new Provincia("Cordoba", 2134235235);
		Provincia p3 = new Provincia("Sevilla", 2134235235);
		
		Set<Provincia> prov = new HashSet<Provincia>(); 
		
		System.out.println(prov.add(p1));
		System.out.println(prov.add(p2));
		System.out.println(prov.add(p3));
		
		for(Provincia provincias : prov) {
			System.out.println(provincias);
		}
	}
}
