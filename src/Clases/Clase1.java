package Clases;
import java.util.Scanner;
public class Clase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String genero = "";
        do {


            System.out.println("¿Eres macho, hembra o helicoptero apache?");
            genero = sc.next();
            //hombre: altura - 110
            //mujer: altura - 120

        } while (!genero.equalsIgnoreCase("Macho") &&
                !genero.equalsIgnoreCase("Hembra") &&
                !genero.equalsIgnoreCase("helicopteroApache"));

        System.out.println("¿Introduce  tu altura?");
        int altura = sc.nextInt();

        if (genero.equalsIgnoreCase("macho")) {
            int peso = altura - 110;
            System.out.println("Tu peso ideal sería:" + peso);

        } else if (genero.equalsIgnoreCase("hembra")) {
            int peso = altura - 120;
            System.out.println("Tu peso ideal sería: " + peso);
        } else if (genero.equalsIgnoreCase("helicopteroApache")) {
            int peso = altura + 420;
            System.out.println("Tu peso ideal sería: " + peso);
        }


    }
}
