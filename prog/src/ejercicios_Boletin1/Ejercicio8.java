package ejercicios_Boletin1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Muestra un n�mero, luego ese n�mero elevado a 2 y a 3
		
		int numA=0;
		
		System.out.println("Introduzca un n�mero entero");
		numA=Entrada.entero();
		
		System.out.println("N�mero: "+numA);
		System.out.println("N�mero elevado a 2: "+(int)Math.pow(numA, 2));
		System.out.println("N�mero elevado a 3: "+(int)Math.pow(numA, 3));
	}

}
