package boletin2;

public class BooksMain {

	public static void main(String[] args) {
		books libro = new books();
		libro.isbn = 123456789;
		libro.titulo = "Titulo del libro";
		libro.autor = "Carlos";
		libro.num_paginas = 100;
		
		System.out.println(libro.tituloNum_paginas());
	}
}