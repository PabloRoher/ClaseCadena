package org.example;

import java.util.Scanner;

public class Menu {

    public void menu(){
        boolean salir = true;
        while (salir) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introdruce los nombres y apellidos de una persona: ");
            String nombre = sc.nextLine();
            Cadena cadena = new Cadena();
            System.out.println(cadena.devuelveIniciales(nombre));

            while (true){
                System.out.println("Desea introducir otro nombre? (S/N)");
                String respuesta = sc.next();
                try {
                    if (respuesta.toUpperCase().equals("N")) {
                        salir = false;
                        break;
                    } else if (!respuesta.toUpperCase().equals("S")) {
                        throw new IllegalArgumentException("La respuesta debe ser S o N");
                    } else {
                        break;
                    }
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
