import java.util.Scanner;

public class Empleado {
    final int password = 1234;
    Scanner sc = new Scanner(System.in);
    String nombre;
    int edad;
    double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;

    }

/////////  PRUEBAS DEL PROGRAMA ////////////

    public boolean Pregunta_Edad(int n1) {

        boolean comprobarEdad = true;

        if (n1 < 18) {
            comprobarEdad = false;
            System.out.println("Edad erronea");
        } else {
            comprobarEdad = true;
            System.out.println("Edad correcta se asigna la nueva edad");
            this.edad = n1;
        }
        return comprobarEdad;
    }
	
    public void Preguntar_Sueldo(int n1) {

        if (n1 == password) {

            System.out.println("Contraseña correcta");
            System.out.println(sueldo);

        } else {

            System.out.println("Contraseña incorrecta");

        }

    }


}







