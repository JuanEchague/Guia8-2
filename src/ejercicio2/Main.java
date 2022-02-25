
package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Main {

    
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      ArrayList<String> razas = new ArrayList<>();
      String opc, aux;
      boolean band;
        do {
            System.out.println("------MENU-------");
            System.out.println("1) Ingresar Raza");
            System.out.println("2) Mostrar razas");
            System.out.println("3) Quitar raza");
            System.out.println("4) Salir");
            opc = read.next().toUpperCase();
            band=false;
            switch (opc) {
                case "1":
                    System.out.println("Ingrese una raza: ");
                    razas.add(read.next());
                    break;
                case "2":
                    System.out.println("Las razas ingresadas hasta ahora son: ");
                    System.out.println(razas);
                    break;
                case "3":
                    System.out.println("Ingrese una raza a eliminar: ");
                    aux = read.next();
                     Iterator<String> iterator = razas.iterator();
                    while(iterator.hasNext()){
                        String perro=iterator.next();
                        if (perro.equals(aux)) {
                            iterator.remove();
                            band=true;
                        }
                    }
                     if (!band) {
                        System.out.println("El perro no esta en la lista");
                    }
                    break;
                case "4":
                     System.out.println("Gracias por su colaboracion!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida ");
            }
        } while (!opc.equals("4"));
    }
    
}
