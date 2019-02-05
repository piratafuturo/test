package añadid;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/*10.Crea un vector vectorInicial de 10 posiciones. Pide al usuario que lo rellene. 
		 Muestra el vector. Ahora genera un bucle que haga lo siguiente:
			- Pida al usuario dos posiciones del vector
			- Trasponga los contenidos de esas dos posiciones en el vector.
			- Muestre el vector por pantalla.
			- Pregunta al usuario si desea trasponer más valores (si no, sale del bucle y termina).*/
		
		int []vectorInicial = new int[10];
		int posicion1, posicion2;
		int temp;
		boolean transposicion = true;
		String respuesta = " ";
		
		System.out.println("Ahora rellenaremos el vector(10): ");
		for(int i=0; i<vectorInicial.length; i++)
		{
			System.out.println("\tEscribe para la posición "+i+" : ");
			vectorInicial[i]=Entrada.entero();
		}
		
		System.out.print("\tEl vector obtenido es: [");
		for(int i=0; i<vectorInicial.length; i++)
			System.out.print(vectorInicial[i]+", ");
		System.out.println("]\n");
		
		while(transposicion)
		{
		
			System.out.println("Ahora escriba dos posiciones y sus nuevos valores: ");
			System.out.print("Posicion 1");
			posicion1=Entrada.entero();
			
			System.out.print("Posicion 2");
			posicion2=Entrada.entero();
			
			temp=vectorInicial[posicion1];
			vectorInicial[posicion1]=vectorInicial[posicion2];
			vectorInicial[posicion2]=temp;
			
			System.out.print("\tEl vector obtenido es: [");
			for(int i=0; i<vectorInicial.length; i++)
				System.out.print(vectorInicial[i]+", ");
			System.out.println("]\n");
			
			System.out.println("¿Quieres transponer más números? si/no");
			respuesta = Entrada.cadena().toLowerCase();
			if(respuesta.equals("no"))
				transposicion=false;
			
		}
		
	}

}
