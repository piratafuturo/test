package a�adid;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[] vectorNumeros= new int [10];
		int numeroMayor=0, posicion=0;
		
		for(int i=0; i<vectorNumeros.length; i++) 
			vectorNumeros[i] = (int) (Math.random() * 100) + 1;
		
		for(int i=0; i<vectorNumeros.length; i++) {
			if(vectorNumeros[i]>=numeroMayor) {
				numeroMayor=vectorNumeros[i];
				posicion=i;
			}
		}
		
		for(int i=0; i<vectorNumeros.length; i++) {
			System.out.println("En la posicion "+i+" est� el n�mero "+vectorNumeros[i]);
		}
		
		System.out.println("El n�mero mayor aleatorio es "+numeroMayor+" y ha salido en la posici�n "+posicion);
	}

}
