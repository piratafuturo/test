package ejercicios_Boletin1;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Escribe un algoritmo que pida al usuario un n�mero, muestre dicho n�mero. 
		  Incremente el valor del n�mero en 1, muestre otra vez el n�mero.
		  Incremente el valor del n�mero en 2 y muestre otra vez el n�mero */
		
		int numero=0;
		
		System.out.println("Introduzca un n�mero");
		numero=Entrada.entero();
		System.out.println("El n�mero introducido por el usuario es: "+numero);
		
		numero++;
		System.out.println("El n�mero aumentado en uno es igual a: "+numero);
		
		numero=numero+2;
		System.out.println("El n�mero aumentado en dos es igual a: "+numero);
		
		
				
	}

}
