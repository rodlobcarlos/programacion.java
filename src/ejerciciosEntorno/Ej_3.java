package ejerciciosEntorno;

import java.util.Scanner;
import java.util.Random;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int yo;
        int maquina;
        
        do {
            System.out.print("Elige una opción del 1 al 3, o 0 para salir: ");
            yo = scanner.nextInt();
            
            if (yo == 0) {
                System.out.println("Saliste");
                break;
            }
            
            if (yo < 1 || yo > 3) {
                System.out.println("Esta opción no es correcta");
                continue;
            }
            
            maquina = random.nextInt(3) + 1;
            
            System.out.println("La computadora eligió: " + maquina);
            
            if (yo == maquina) {
                System.out.println("¡Empate!");
            } else if ((yo == 1 && maquina == 3) ||
                       (yo == 2 && maquina == 1) ||
                       (yo == 3 && maquina == 2)) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡La computadora gana!");
            }
            
        } while (yo != 0);
        
        scanner.close();
    }
}

	