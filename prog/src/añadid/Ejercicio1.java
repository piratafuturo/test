package a�adid;

public class Ejercicio1 {

	public static void main(String[] args) {
		int contP=0, contI=0;
		int vectorAleatorio[]=new int [10];
		
		System.out.println("Introduce en el vector n�meros aleatorios del 1 al 20");
		
		//rellenar vector con n�meros aleatorios
		for(int i=0; i<vectorAleatorio.length;i++)		
			vectorAleatorio[i]=(int)(Math.random()*(20)+1);
		
		//mostrar datos del vector
		for(int i=0; i<vectorAleatorio.length;i++)
			System.out.println("Posici�n "+i+": "+vectorAleatorio[i]);
			
		//contar n�meros pares y n�meros impares
		for(int i=0; i<vectorAleatorio.length;i++) {
			if(vectorAleatorio[i]%2==0)
				contP++;
			else
				contI++;
		}
		
		System.out.println("\nEn el vector hay "+contP+" n�meros pares y "+contI+" n�meros impares");
		
		

	}

}
