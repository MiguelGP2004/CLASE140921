
package ejercicios14092021;

import java.util.Scanner;


public class ejercicio2 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        int horas, semanas, dias, horas1; 
        horas = entrada.nextInt();
        System.out.println("Numero de horas que desea: "+ horas);
        semanas = horas / 168;
        dias = horas %168 / 24;
        horas1 = horas%24;
        System.out.println("El numero de semanas es: "+semanas);
        System.out.println("El numero de dias es: "+dias);
        System.out.println("El numero de horas restantes es: "+horas1);

    }
    
}
