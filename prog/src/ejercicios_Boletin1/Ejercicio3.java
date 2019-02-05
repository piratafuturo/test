package ejercicios_Boletin1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Pide al usuario un nombre y dos apellidos y los devuelve.
		
		String nombre=" ", apellido1=" ", apellido2=" ";
		
		System.out.println("Introduzca un nombre");
		nombre=Entrada.cadena();
		
		System.out.println("Introduzca su primer apellido");
		apellido1=Entrada.cadena();
		
		System.out.println("Introduzca su segundo apellido");
		apellido2=Entrada.cadena();
		
		System.out.println("Su nombre es "+nombre+" "+apellido1+" "+apellido2);
		
		
	}

}
