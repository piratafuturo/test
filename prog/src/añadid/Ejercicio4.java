package añadid;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numerosPositivos = new int[10];
		int sumaPares=0;
		int sumaImpares=0;
		for (int i = 0; i < numerosPositivos.length; i++) {
			System.out.println("Introduce el valor para la posicion " + i + ": (1-20)");
			numerosPositivos[i] = Entrada.entero();

		}
		for (int i = 0; i < numerosPositivos.length; i++) {
			if (numerosPositivos[i] % 2 == 0) {
				sumaPares=numerosPositivos[i]+sumaPares;
			} else {
				sumaImpares=numerosPositivos[i]+sumaImpares;
			}
		}
		System.out.println("La suma de los pares: "+sumaPares);

		System.out.println("La suma de los impares: "+sumaImpares);
	}

}
