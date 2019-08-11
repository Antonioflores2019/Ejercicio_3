package flores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList();


        System.out.println("\t******Sistema de Mantenimiento y Creacion de Vehiculos ******");
        while (true){
            System.out.println("1. Crear  un vehiculo");
            System.out.println("2. Mostrar vehiculos creados");
            System.out.println("3. Salir del Sistema");
            int opcion = LectorDeDatos.solicitarEntero("\nIngrese una opcion: ");

            switch (opcion){
                case 1:
                    int i = 0;
                    while (i == 0) {
                        System.out.println("1. Toyota");
                        System.out.println("2. Ford");
                        System.out.println("3. Nissan");
                        System.out.println("4. Honda");
                        int modelo = LectorDeDatos.solicitarEntero("Especifique el Modelo del vehiculo:");


                        if (modelo == 1) {
                            System.out.println("\t--**Creacion de un Vehiculo Ford**--");
                            System.out.println("Ingrese el color del vehiculo:");
                            String color = lector.nextLine();

                            int a = LectorDeDatos.solicitarEntero("Ingrese el año del Vehiculo: ");
                            double precio = LectorDeDatos.solicitarEntero("Ingrese el Precio del vehiculo: ");

                            Toyota nuevoVehiculo = new Toyota();
                            nuevoVehiculo.color = color;
                            nuevoVehiculo.a = a;
                            nuevoVehiculo.precio = precio;
                            vehiculos.add(nuevoVehiculo);
                            System.out.println("El Vihuclo Toyota ha sido creado exitosamente");
                            System.out.println("----------------------------------------------");
                        } else if (modelo == 2) {
                            System.out.println("Ingrese el color del vehiculo:");
                            String color = lector.nextLine();
                            int a = LectorDeDatos.solicitarEntero("Ingrese el año del Vehiculo: ");
                            double precio = LectorDeDatos.solicitarEntero("Ingrese el Precio del vehiculo: ");

                            Ford nuevoVehiculo = new Ford();
                            nuevoVehiculo.color = color;
                            nuevoVehiculo.a = a;
                            nuevoVehiculo.precio = precio;
                            vehiculos.add(nuevoVehiculo);
                            System.out.println("El Vehiculo Ford ha sido creado exitosamente");
                            System.out.println("----------------------------------------------");
                        } else if (modelo == 3) {
                            Nissan nuevoVehiculo = new Nissan();

                            System.out.println("Ingrese el color del vehiculo:");
                            String color = lector.nextLine();
                            int a = LectorDeDatos.solicitarEntero("Ingrese el año del Vehiculo: ");
                            double precio = LectorDeDatos.solicitarEntero("Ingrese el Precio del vehiculo: ");


                            nuevoVehiculo.color = color;
                            nuevoVehiculo.a = a;
                            nuevoVehiculo.precio = precio;
                            vehiculos.add(nuevoVehiculo);
                            System.out.println("El Vehiculo Nissan ha sido creado exitosamente");
                            System.out.println("----------------------------------------------");
                        } else if (modelo == 4) {
                            System.out.println("Ingrese el color del vehiculo:");
                            String color = lector.nextLine();
                            int a = LectorDeDatos.solicitarEntero("Ingrese el año del Vehiculo: ");
                            double precio = LectorDeDatos.solicitarEntero("Ingrese el Precio del vehiculo: ");

                            Honda nuevoVehiculo = new Honda();
                            nuevoVehiculo.color = color;
                            nuevoVehiculo.a = a;
                            nuevoVehiculo.precio = precio;
                            vehiculos.add(nuevoVehiculo);
                            System.out.println("El Vehiculo Honda ha sido creado exitosamente");
                            System.out.println("----------------------------------------------");

                        } else {
                            System.out.println("El modelo que ingreso no exite");
                        }
                        System.out.println("Desea crear otro Vehiculo : Si(1)---No(2)");
                        i = lector.nextInt();
                    }

                    break;
                case 2:
                    if (vehiculos.isEmpty()) {
                        System.out.println("**** No hay vehiculos existentes****");
                    } else {
                        System.out.println("\t**** Mostrando Vehiculos Creados ****");
                    }
                    for (Vehiculo c : vehiculos){
                        if (c instanceof Toyota) {
                            System.out.println("Modelo: Toyota");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.a);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        } else if (c instanceof  Nissan) {
                            System.out.println("Modelo: Nissan");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.a);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (opcion == 3) {
                break;
            }
        }
    }
}