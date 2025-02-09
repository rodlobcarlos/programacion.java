package boletin_2;

public class books {
	int isbn;
	String titulo;
	String autor;
	int num_paginas;

	String tituloNum_paginas() {
		String datos = "titulo: " + titulo + ", numero de páginas: " + num_paginas+"pág";
		return datos;
	}
}