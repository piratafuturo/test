package añadid;

public class Ejercicio1 {

	public static void main(String[] args) {
		int contP=0, contI=0;
		int vectorAleatorio[]=new int [10];
		
		System.out.println("Introduce en el vector números aleatorios del 1 al 20");
		
		//rellenar vector con números aleatorios
		for(int i=0; i<vectorAleatorio.length;i++)		
			vectorAleatorio[i]=(int)(Math.random()*(20)+1);
		
		//mostrar datos del vector
		for(int i=0; i<vectorAleatorio.length;i++)
			System.out.println("Posición "+i+": "+vectorAleatorio[i]);
			
		//contar números pares y números impares
		for(int i=0; i<vectorAleatorio.length;i++) {
			if(vectorAleatorio[i]%2==0)
				contP++;
			else
				contI++;
		}
		
		System.out.println("\nEn el vector hay "+contP+" números pares y "+contI+" números impares");
		
		

	}

}
