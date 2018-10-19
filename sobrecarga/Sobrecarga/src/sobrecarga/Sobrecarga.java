/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //se instancia el metodo, se crea el objeto
        Trabajador t = new Trabajador();
        // se pide al usuario el numero de nombres
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        //se limpia el scanner
        scanner.nextLine();
        // se realiza las condiciones para ingresar el nombre si es uno 
        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
            // si la respuesta del usuario es dos 
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }
        // se pide el apellido 
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        // se pide al usuario la frecuencia del pago 
        System.out.println("Ingrese la frecuencia del pago \n 1. semanal \n 2. mensual \n 3. mensual(for)");
        int frecuencia = scanner.nextInt();
        // se realiza las condiciones para ingresar el sueldo 
        if (frecuencia == 1) {
            System.out.println("Ingrese el valor del sueldo semanal");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        } else {
            if (frecuencia == 2) {
                System.out.println("Ingrese el valor del sueldo de la semana1");
                double sueldo1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del sueldo de la semana2");
                double sueldo2 = scanner.nextDouble();
                System.out.println("Ingrese el valor del sueldo de la semana3");
                double sueldo3 = scanner.nextDouble();
                System.out.println("Ingrese el valor del sueldo de la semana4");
                double sueldo4 = scanner.nextDouble();

                t.agrear_sueldo(sueldo1, sueldo2, sueldo3, sueldo4);
                // este es el tercer caso aparecido al 2 pero se usa un array
            } else {
                if (frecuencia == 3) {
                    double sueldos[] = new double[4];
                    t.agregar_sueldo(sueldos);
                }
            }

        }
        //se presenta
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());

    }

}
