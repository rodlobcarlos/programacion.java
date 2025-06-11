package agenda_contactosOrdenaciones;

import java.util.HashSet;
import java.util.Set;

public class Agenda {

	Set<Contacto> listaContacto;

	public Agenda(Set<Contacto> listaContacto) {
		super();
		this.listaContacto = new HashSet<Contacto>();
	}

	@Override
	public String toString() {
		return "Agenda [listaContacto=" + listaContacto + "]";
	}

	public Set<Contacto> getListaContacto() {
		return listaContacto;
	}

	public void setListaContacto(Set<Contacto> listaContacto) {
		this.listaContacto = listaContacto;
	}
	
	// AGREGAR CONTACTO
	public void agregarContacto(Contacto o) {
		if(listaContacto.contains(o)) {
			System.out.println("Este contacto ya está en la agenda -> " + o );
		}else {
			listaContacto.add(o);
			System.out.println("Contacto añadido: " + o);
		}
	}
	
	// ELIMINAR CONTACTO
	public void elimiarContacto(Contacto o) {
		if(listaContacto.contains(o)) {
			listaContacto.remove(o);
			System.out.println("Contacto eliminado: " + o);
		}else {
			System.out.println("Este contacto no está en la lista.");
		}
	}
	
	// BUSCAR CONTACTO
	public void buscarContacto(String nombre, String apellido) {
		for(Contacto o : listaContacto) {
			if(listaContacto.contains(nombre)
					&& listaContacto.contains(apellido)) {
				System.out.println("Telefono e email -> " + o.getNumero_telefono() + " " + o.getEmail());
			}
		}
	}
	
	// MOSTRAR CONTACTOS
	public Set<Contacto> mostrarContactos() {
		return listaContacto;
	}
}
