package ejercicios_Boletin1;

public class Ejercicio1 {

	public static void main(String[] args) {
		//  Vamos a realizar un algoritmo que nos permita definir un número y multiplicarlo por 2 y por 3
		
		int numeroA=0, multiplicacion=0;
		System.out.println("Introduzca un número entero");
		numeroA=Entrada.entero();
		
		multiplicacion=numeroA*2;
		System.out.println("La multiplicación de "+numeroA+"por 2 es:"+multiplicacion);
		
		multiplicacion=numeroA*3;
		System.out.println("La multiplicacion de "+numeroA+"por 3 es: "+multiplicacion);
		
		}

}
