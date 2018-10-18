//Importa el paquete que contiene la clase Scanner
import java.util.*;

//Definicion de la clase
public class TestAnimal {
	
	//Definicion del Metodo principal
	public static void main(String[] args){
		
		//Declaracion del objeto Animal
		Animal animal1 = new Animal();
		
		//Declaracion del objeto teclado de la clase Scanner
		Scanner teclado = new Scanner(System.in);
		
		//Pedir el nombre del animal
		System.out.print("Teclear nombre del Animal");
		
		//Leer y asignar nombre del objeto animal1
		animal1.setNombre(teclado.nextLine());
		
		//Pedir la edad del animal
		System.out.print("Teclear la edad del animal");
		int edad = teclado.nextInt();

		//Asignar edad del objeto animal
		animal1.setEdad(edad);

		//Informar de los datos de animal1
		animal1.nace();
		System.out.println("Me llamo "+ animal1.getNombre() + " y tengo " + animal1.getEdad() + " años");
	}
}