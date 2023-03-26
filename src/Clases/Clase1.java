package Clases;
import java.util.Scanner;
import javax.swing.*;
public class Uso_Coche {

    public static void main(String[] args) {

        //instanciamos un objeto de la clase coche
        Coche Seat=new Coche();

        Seat.establece_color(JOptionPane.showInputDialog("Introduce color. "));
        System.out.println(Seat.dime_color());

        System.out.println(Seat.dime_datos_generales());

        Seat.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?(si/no)"));
        System.out.println(Seat.dime_asientos());

        Seat.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climamtizador?(si/no)"));
        System.out.println(Seat.dime_climatizador());

        //no hace falta primnero establecerlo por que este metodo hacia las dos cosas a la vez
        System.out.println(Seat.dime_peso_coche());

        System.out.println("El precio final del coches es " + Seat.precio_coche());
    }
}
