// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        System.out.println("El nombre es: " + persona.getNombre());
    }
}
/*
    •	En la clase Main, se crea una instancia de Persona y se usa el método setNombre para asignar un valor a nombre, y el método getNombre para obtener y mostrar el valor de nombre.
*/

// Archivo: Persona.java
public class Persona {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
/*
En este ejemplo:

	•	La clase Persona tiene un atributo nombre declarado como private, lo que significa que solo puede ser accedido directamente dentro de la clase Persona.
	•	Para permitir el acceso controlado al atributo nombre, se han definido métodos public (setNombre y getNombre) que permiten establecer y obtener el valor de nombre, respectivamente.

Esto demuestra cómo private se utiliza para encapsular los datos y controlar el acceso a ellos mediante métodos públicos.
*/
