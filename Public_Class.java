// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.mostrarNombre();
    }
}

// Archivo: Persona.java

public class Persona {
    public String nombre;

    public void mostrarNombre() {
        System.out.println("El nombre es: " + nombre);
    }
}

/*
En este ejemplo:

	•	La clase Main y la clase Persona están ambas declaradas como public, lo que significa que pueden ser accedidas desde cualquier otro lugar del programa.

	•	El atributo nombre y el método mostrarNombre en la clase Persona también son public, por lo que pueden ser accedidos y modificados desde cualquier otra clase, en este caso, desde la clase Main.

    Como resultado, puedes crear una instancia de Persona en Main, asignar un valor a nombre, y llamar al 
    método mostrarNombre sin ningún problema.
 */