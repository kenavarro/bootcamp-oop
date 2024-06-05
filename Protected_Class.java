// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.setSalario(5000);
        empleado.mostrarInfo();
    }
}
/* 
	•	En la clase Main, se crea una instancia de Empleado, se asigna un valor al nombre y al salario usando los métodos setNombre y setSalario, y se llama al método mostrarInfo para mostrar la información del empleado.

Este ejemplo muestra cómo protected permite que las subclases accedan a miembros de la clase padre, facilitando la herencia y reutilización de código.
*/


// Archivo: Persona.java

public class Persona {
    protected String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
/* 
•	La clase Persona tiene un atributo nombre declarado como protected, lo que significa que puede ser accedido dentro del mismo paquete y también por cualquier clase que herede de Persona, incluso si está en un paquete diferente.
*/

// Archivo: Empleado.java

public class Empleado extends Persona {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre); // Acceso permitido gracias a protected
        System.out.println("Salario: " + salario);
    }
}

/*
	•	La clase Empleado hereda de Persona, y por lo tanto puede acceder al atributo nombre directamente, a pesar de que nombre es protected.

	•	La clase Empleado también tiene un método mostrarInfo que muestra el nombre y el salario del empleado.
*/