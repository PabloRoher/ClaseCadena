package org.example;

public class Cadena {

    public String devuelveIniciales(String nombre) {
        try {
            if (nombre == null || nombre.isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
            } else if (comprobarNumeros(nombre)) {
                throw new IllegalArgumentException("El nombre no puede ser un número");
            }
            String[] palabras = nombre.toUpperCase().split(" ");
            String iniciales = "";
            for (String palabra : palabras) {
                iniciales += palabra.charAt(0) + ".";
            }
            return iniciales;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        String cadenaVacia = "";
        return cadenaVacia;
    }

    public boolean comprobarNumeros(String cadena) {
        for (int i = 0; i < cadena.length(); i++)
        {
            char c = cadena.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
