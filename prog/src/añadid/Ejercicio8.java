package añadid;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] vectorDelDerecho;
		int[] vectorDelReves;
		int tamaño = 0, i = 0, j = 0;

		System.out.println("Indica el tamñao del vector");
		tamaño = Entrada.entero();
		vectorDelDerecho = new int[tamaño];

		for (i = 0; i < vectorDelDerecho.length; i++) {
			System.out.println("Introduce un número");
			vectorDelDerecho[i] = Entrada.entero();
		}
		
		for (i = 0; i < vectorDelDerecho.length; i++)
			System.out.print("En la posicion " + i + " está el número " + vectorDelDerecho[i]+" ");

		vectorDelReves = new int[tamaño];
		i = tamaño-1;
		
		while (j < tamaño) {
			vectorDelReves[j] = vectorDelDerecho[i];
			i--;
			j++;
		}
		
		/*
		for(i=0;i<vectorDelReves.length;i++)
		{
			vectorDelReves[i] = vectorDelDerecho[vectorDelReves.length-(i+1)];
		}
		*/
			
		System.out.println(" ");
		for (j = 0; j < vectorDelReves.length; j++)
			System.out.print("En la posicion " + j + " está el número " + vectorDelReves[j]+" ");
	}

}
