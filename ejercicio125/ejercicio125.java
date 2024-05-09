/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio125;

import ejercicio125.TablaDispersa;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio125 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        TablaDispersa Tabla =new TablaDispersa();
        int op;
        Tabla.iniciar();
        do{
            System.out.println("Menu");
            System.out.println("1: Para ingresar una Casa a la Tabla");
            System.out.println("2: Para Buscar Casa en la Tabla");
            System.out.println("3: Para eliminar una Casa de la Tabla ");
            System.out.println("4: Para salir del sistema");
            op= leer.nextInt();
            switch(op){
                case 1:
                   System.out.println("Ingrese los datos de la casa");
                   System.out.println("Ingrese el codigo");
                   leer.nextLine();
                   String codigo=leer.nextLine();
                   System.out.println("Ingrese la poblacion");
                   String poblacion=leer.nextLine();
                   System.out.println("Ingrese la direccion");
                   String direccion=leer.nextLine();
                   System.out.println("Ingrese el numero dela habitacion");
                   int habitacion=leer.nextInt();
                   System.out.println("Ingrese el precio por dia de la casa");
                   double precio=leer.nextDouble();
                   CasaRural casa1 = new CasaRural(codigo, poblacion,habitacion, precio,true,direccion);
                    Tabla.insertar(casa1);
                    break;
                case 2:
                    System.out.println("Busqueda");
                    System.out.println("ingrese El codigo");
                    leer.nextLine();
                    String id =leer.nextLine();
                    Tabla.buscar(id);
                    break;
                case 3:
                    System.out.println("Eliminar");
                    System.out.println("ingrese El codigo");
                    leer.nextLine();
                    String eli =leer.nextLine();
                    Tabla.eliminar(eli);
                    break;
                case 4:
                    break;
            }
            
        }while(op!=4);
    }
}

