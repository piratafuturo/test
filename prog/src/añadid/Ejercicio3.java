package añadid;

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
			System.out.println("En la posicion "+i+" está el número "+vectorNumeros[i]);
		}
		
		System.out.println("El número mayor aleatorio es "+numeroMayor+" y ha salido en la posición "+posicion);
	}

}
