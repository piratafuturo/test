package a�adid;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] vectorDelDerecho;
		int[] vectorDelReves;
		int tama�o = 0, i = 0, j = 0;

		System.out.println("Indica el tam�ao del vector");
		tama�o = Entrada.entero();
		vectorDelDerecho = new int[tama�o];

		for (i = 0; i < vectorDelDerecho.length; i++) {
			System.out.println("Introduce un n�mero");
			vectorDelDerecho[i] = Entrada.entero();
		}
		
		for (i = 0; i < vectorDelDerecho.length; i++)
			System.out.print("En la posicion " + i + " est� el n�mero " + vectorDelDerecho[i]+" ");

		vectorDelReves = new int[tama�o];
		i = tama�o-1;
		
		while (j < tama�o) {
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
			System.out.print("En la posicion " + j + " est� el n�mero " + vectorDelReves[j]+" ");
	}

}
