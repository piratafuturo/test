package ejercicios_Boletin1;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Escribe un algoritmo que pida al usuario un número, muestre dicho número. 
		  Incremente el valor del número en 1, muestre otra vez el número.
		  Incremente el valor del número en 2 y muestre otra vez el número */
		
		int numero=0;
		
		System.out.println("Introduzca un número");
		numero=Entrada.entero();
		System.out.println("El número introducido por el usuario es: "+numero);
		
		numero++;
		System.out.println("El número aumentado en uno es igual a: "+numero);
		
		numero=numero+2;
		System.out.println("El número aumentado en dos es igual a: "+numero);
		
		
				
	}

}
