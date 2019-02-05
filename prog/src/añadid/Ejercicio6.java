package añadid;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] numerosSinrepetir = new int[10];
		int aleatorio,j=0,i=0;
		boolean encontrado;

		while(i<numerosSinrepetir.length) {
			encontrado = false;
			j=0;
			aleatorio = (int) (Math.random() * 50 + 1);

			while(!encontrado && j<i){
				if (numerosSinrepetir[j] == aleatorio) 
					encontrado = true;
				j++;
					
			}
			if (!encontrado) {
				numerosSinrepetir[i] = aleatorio;
				i++;
			}
		}

		for (i = 0; i < numerosSinrepetir.length; i++) {
			System.out.println("En la posición " + i + " está el valor " + numerosSinrepetir[i]);
		}
	}
}
