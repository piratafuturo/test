package añadid;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 *Crea un vector numerosPositivos de 10 posiciones y pide al usuario que los rellene con valores
		 *entre 1 y 20. Muestra por pantalla la suma de los números que están en las posiciones pares por un
		 *lado y la suma de los números que están en las posiciones impares por otro. 
		 */
		Scanner entrada= new Scanner(System.in);
		int [] numerosPositivos=new int[10];
		for(int i=0;i<numerosPositivos.length;i++) {
			System.out.println("Introduce numeros de el 1 al 20:");
			numerosPositivos[i]=entrada.nextInt();
		}
		int sumaPosPar=0,sumaPosImpar=0;
		for(int i=0;i<numerosPositivos.length;i++) {
			if(i%2==0) {
				sumaPosPar=sumaPosPar+numerosPositivos[i];
			}else {
				sumaPosImpar=sumaPosImpar+numerosPositivos[i];
			}
		}
		System.out.println("la suma de las posiciones pares del vector son:"+sumaPosPar);
	
		System.out.println("la suma de las posiciones impares del vector son:"+sumaPosImpar);
		
	}

}
