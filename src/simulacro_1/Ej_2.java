package simulacro_1;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Ej_2 eje = new Ej_2();
        System.out.println("Dime un numero: ");
        String numeroCadena = input.next();
        String resultado = eje.redondear(numeroCadena);
    }
    String redondear (String numeroARedondear) {
        int numerodecimales = calculanumerosdecimales (numeroARedondear);
        String resultado = numeroARedondear;
        if (numerodecimales >= 3) {
            resultado = redondeoCon2oMasdecimales (numeroARedondear);
        }else if  (numerodecimales < 2) {
             resultado = redondeoCon2oMasdecimales (numeroARedondear);
        }
        System.out.println(resultado);
        return numeroARedondear;
    }
    String redondeoCon2oMasdecimales(String numeroARedondear) {
        String resultado = numeroARedondear;
        int numeroDecimales = calculanumerosdecimales(resultado);
        while (numeroDecimales !=2) {
            if (numeroDecimales == 0) {
                resultado = resultado +",0";
            }else {
                resultado = resultado +"0";
            }
            numeroDecimales = calculanumerosdecimales (resultado);
        }
        return resultado;
    }
    int calculanumerosdecimales (String numeroARedondear) {
        String [] partes = numeroARedondear.split(",");
        int numDecimales;
        if (partes.length == 2) {
            numDecimales = partes[1].length();
        }else {
            numDecimales = 0;
        }
        return numDecimales;
    }
}