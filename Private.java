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



 */