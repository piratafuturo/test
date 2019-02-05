package ejercicios_Boletin1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Muestra un número, luego ese número elevado a 2 y a 3
		
		int numA=0;
		
		System.out.println("Introduzca un número entero");
		numA=Entrada.entero();
		
		System.out.println("Número: "+numA);
		System.out.println("Número elevado a 2: "+(int)Math.pow(numA, 2));
		System.out.println("Número elevado a 3: "+(int)Math.pow(numA, 3));
	}

}
