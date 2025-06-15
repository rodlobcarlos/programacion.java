package videojuego.controlador;

import videojuego.modelo.EstadoJuego;
import videojuego.modelo.EstudioDesarrollo;
import videojuego.modelo.GeneroJuego;
import videojuego.modelo.Juego;
import videojuego.repositorio.PlataformaVideojuegos;

public class GestionaPlataforma {

    public static void main(String[] args) {
    
    	/* INICIO DEL BLOQUE NO EDITABLE */
    	PlataformaVideojuegos plataforma = new PlataformaVideojuegos();
    	/*
        // carga inicial
        plataforma.agregarJuego(new Juego("Pixel Quest", "2023", GeneroJuego.AVENTURA, 12000),
                new EstudioDesarrollo("DreamGames", "Laura Pérez", "España"));

        plataforma.agregarJuego(new Juego("Logic Maze", "2022", GeneroJuego.PUZLE, 5000),
                new EstudioDesarrollo("PuzzleCorp", "David Ruiz", "México"));

        plataforma.agregarJuego(new Juego("Boom Blast", "2024", GeneroJuego.ACCION, 25000),
                new EstudioDesarrollo("ExplodeStudio", "Ana Gómez", "Argentina"));

        plataforma.agregarJuego(new Juego("Farm Sim 3000", "2023", GeneroJuego.SIMULADOR, 9000),
                new EstudioDesarrollo("AgroTech", "Carlos Ortega", "España"));

        plataforma.agregarJuego(new Juego("Shadow Runner", "2022", GeneroJuego.ACCION, 15000),
                new EstudioDesarrollo("DarkCode", "Elena Díaz", "Chile"));

        plataforma.agregarJuego(new Juego("Color Blocks", "2023", GeneroJuego.PUZLE, 3000),
                new EstudioDesarrollo("CreativeBits", "Pedro López", "España"));
        
        System.out.println("# Inicio del bloque de pruebas\n");
        
        // Prueba 1: Buscar juego existente
        Juego buscado = plataforma.buscarJuego("Pixel Quest", "2023");
        System.out.println(buscado != null && buscado.getTitulo().equals("Pixel Quest") && buscado.getAñoPublicacion().equals("2023")
        		? "OK buscarJuego existente" : "Error buscarJuego existente");

        // Prueba 2: Buscar juego NO existente
        Juego noEncontrado = plataforma.buscarJuego("Inexistente", "2025");
        System.out.println(noEncontrado == null ? "OK buscarJuego no existente" : "Error buscarJuego no existente");

        // Prueba 3: Cambiar estado correctamente
        boolean cambio = plataforma.cambiarEstado("Pixel Quest", "2023", EstadoJuego.APROBADO);
        System.out.println(cambio&&plataforma.buscarJuego("Pixel Quest", "2023").getEstado()==EstadoJuego.APROBADO?"OK cambiarEstado existente":"Error cambiarEstado existente");

        // Prueba 4: Cambiar estado de juego no existente
        boolean cambioFallo = plataforma.cambiarEstado("Ghost Game", "2021", EstadoJuego.APROBADO);
        System.out.println(!cambioFallo ? "OK cambiarEstado no existente" : "Error cambiarEstado no existente");

        // Prueba 5: Top 3 por descargas
        List<Juego> top3 = plataforma.top3PorDescargas();
        boolean correcto=top3!=null&&top3.size()==3&&top3.get(0).getNumDescargas()>=top3.get(1).getNumDescargas()&&top3.get(1).getNumDescargas()>=top3.get(2).getNumDescargas();
        System.out.println(correcto?"OK top3PorDescargas":"Error top3PorDescargas");

        // Prueba 6: Filtrar juegos de España
        List<Juego> espanoles = plataforma.filtrarPorPais("España");
        System.out.println(espanoles!=null&&espanoles.size()==3?"OK filtrarPorPais España":"Error filtrarPorPais España");
        */
        
        /* FIN DEL BLOQUE NO EDITABLE */
        
        /* (OPCIONAL) AÑADE A PARTIR DE AQUÍ EL CODIGO QUE CONSIDERES PARA TUS PROPIAS PRUEBAS (OPCIONAL) */
        
    	// AGREGAR JUEGO
        Juego juego1 = new Juego("Titulo1", "2025", GeneroJuego.AVENTURA, 4);
        EstudioDesarrollo estudio1 = new EstudioDesarrollo("Estudio1", "Desarrollador1", "Mexico");
        plataforma.agregarJuego(juego1, estudio1);
        
        // ENCONTRAR JUEGO
        plataforma.buscarJuego("Titulo1", "2025");
        
        //CAMBIAR ESTADO
        plataforma.cambiarEstado("Titulo1", "2025", EstadoJuego.EN_REVISION);
        
        // TOP3 POR DESCARGAS
//        System.out.println(plataforma.top3PorDescargas());
        
        // FILTRAR POR PAIS
        System.out.println(plataforma.filtrarPorPais("Mexico"));
        
    }
}
