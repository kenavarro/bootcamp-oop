// Archivo: Main.java
package com.example.main;

import com.example.persona.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";  // Esto funcionará porque Main y Persona están en el mismo paquete
        persona.mostrarNombre();
    }
}

/*
    •	La clase Main y la clase Persona están en el mismo paquete (com.example.main y com.example.persona), por lo que Main puede acceder a los miembros nombre y mostrarNombre de Persona.
	
    •	Si intentaras acceder a Persona desde una clase en un paquete diferente, obtendrías un error de compilación porque Persona y sus miembros no son accesibles fuera del paquete.
*/

// Archivo: Persona.java
package com.example.persona;

class Persona {
    String nombre;  // default access modifier (package-private)

    void mostrarNombre() {  // default access modifier (package-private)
        System.out.println("El nombre es: " + nombre);
    }
}

/*
	•	La clase Persona y sus miembros nombre y mostrarNombre no tienen ningún modificador de acceso explícito, por lo que son default (package-private). Esto significa que solo pueden ser accedidos desde otras clases que estén en el mismo paquete.
	

Este ejemplo muestra cómo default (package-private) permite que las clases y miembros sean accesibles solo dentro del mismo paquete, proporcionando un nivel de encapsulación adecuado para los elementos que no deben ser expuestos fuera del paquete.
*/

