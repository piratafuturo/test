package ejercicios_Boletin1;

public class Ejercicio10 {

	public static void main(String[] args) {
		/* Pide al usuario su nombre y la edad para después 
		mandar un mensaje en el que este su nombre y edad*/
		
		String nombre;
		int edad;
		
		System.out.println("Introduzca su nombre");
		nombre=Entrada.cadena();
		
		System.out.println("Introduzca su edad");
		edad=Entrada.entero();
		
		System.out.println("Hola "+nombre+", tienes "+edad+" ¡Que mayor eres!");
		
				
		
		
	}

}
