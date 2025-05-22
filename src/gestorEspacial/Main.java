/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorEspacial;

import gestorEspacial.models.*;

import java.util.Scanner;

/**
 * @author diego
 */
public class Main {

    static SpacialAgency specialAgency = new SpacialAgency();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar misión de exploración");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves por año (descendente)");
            System.out.println("6. Mostrar naves por tripulación (descendente)");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1:


                    System.out.println("Tipo de nave: 1. Exploración 2. Carguero 3. Crucero");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Capacidad de tripulación: ");
                    int crew = sc.nextInt();
                    System.out.print("Año de lanzamiento: ");
                    int year = sc.nextInt();

                    switch (type) {
                        case 1:
                            sc.nextLine(); // limpiar
                            System.out.print("Tipo de misión (CARTOGRAFIA, INVESTIGACION, CONTACTO): ");
                            String mision = sc.nextLine();
                            specialAgency.addShip(new Exploration(nombre, crew, year, mision));
                            break;
                        case 2:
                            System.out.print("Capacidad de carga (100-500): ");
                            int carge = sc.nextInt();
                            if (carge > 100 && carge < 500){
                                specialAgency.addShip(new CargoShips(nombre, crew, year, carge));
                                break;
                            }else {
                                System.out.print("!! Ha excedido la capcidad de carga !!  (Ingrese una cantidad valida): ");
                            }
                        case 3:
                            System.out.print("Cantidad de pasajeros: ");
                            int passangers = sc.nextInt();
                            specialAgency.addShip(new Cruises(nombre, crew, year, passangers));
                            break;
                        default:
                            System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    specialAgency.showShips();
                    break;
                case 3:
                    specialAgency.startExploration();
                    break;
                case 4:
                    specialAgency.shipNameSort();
                    break;
                case 5:
                    specialAgency.shipYearSort();
                    break;
                case 6:
                    specialAgency.shipCrewSort();
                    break;
                case 7:
                    System.out.println("¡Saliendo del sistema!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();

    }

}
